#!/bin/bash
set -xe
export UBUNTU_MENUPROXY=0
dir=`dirname $0`
cd $dir
binary=../../../../repo/Archi/linux.gtk.x86_64/Archi
rm -rf .archi out
for i in ../*.style ../tests/*.style
do
	stylename=`basename $i .style`
	echo $binary -data $dir/.archi -load $PWD/../../doc/styledhtml.archimate -targetdir $PWD/out/$stylename -runstyle $PWD/$i -exit
	$binary -data $dir/.archi -load $PWD/../../doc/styledhtml.archimate -targetdir $PWD/out/$stylename -runstyle $PWD/$i -exit
done
rm -rf .archi
for i in `find out -name '*.html' -o -name '*.docbook' |xargs grep -l pubdate`
do
	grep -v pubdate $i >$i.nopub
	mv $i.nopub $i
done

if diff -x '*.png' -ru baseline out
then
	echo "tests SUCCEEDED."
	exit 1
else
	echo "tests FAILED."
	exit 1
fi
rm -rf internal out
