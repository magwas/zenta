all:
	tools/script

testenv:
	docker run --rm -p 5900:5900 -v $$(pwd):/zenta -it magwas/zenta /bin/bash

zentaworkaround:
	mkdir -p ~/.zenta/.metadata/.plugins/org.eclipse.e4.workbench/
	cp etc/workbench.xmi ~/.zenta/.metadata/.plugins/org.eclipse.e4.workbench/

