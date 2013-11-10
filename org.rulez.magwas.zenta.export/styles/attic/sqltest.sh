#!/bin/bash
set -xe
./sqlexport.py DDL |
 psql service=archi
xsltproc sql.xslt ../../doc/styledhtml.zenta|./sqlexport.py 13 root
./sqlimport.py 13 root >/tmp/output1.zenta
psql "service=archi"<<EOF
set role root;
drop view property_view; drop view object_view; drop view repository;
drop table object cascade; drop table property;drop table version cascade; drop table version_hierarchy; drop table object_role cascade;
\d
EOF
(echo 'set role root;'; ./sqlexport.py ACCDDL )|
 psql "service=archi"
psql "service=archi"<<EOF
set role root;
alter group archi_submitter add user mag;
alter group archi_viewer add user mag;
EOF
xsltproc sql.xslt ../../doc/styledhtml.zenta|./sqlexport.py 13 archi_submitter
./sqlimport.py 13 archi_submitter >/tmp/output2.zenta
psql service=archi<<EOF
set role root;
drop view property_view; drop view object_view; drop view repository;
drop table object_data cascade; drop table property;drop table version cascade; drop table version_hierarchy; drop table acl cascade;
drop table aclentry;
drop view object;
drop role archi_owner; drop role archi_submitter; drop role archi_viewer; drop role archi_addperm;

\d
EOF
#load/save the two files with zenta, and do a diff
#due to the unordered sql queryes they won't be exactly the same
