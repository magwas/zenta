#!/bin/bash
diff -u <(for i in `find -name '*.java' |grep tests`; do basename $i; done|sort -u) <(for i in `find ../phil -name '*.java' |grep tests`; do basename $i; done |sed 's/Archimate/Zenta/' |sort ) |grep '^+'
