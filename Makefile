build:
	tools/script

testenv:
	docker run --rm -p 5900:5900 -v $$(pwd):/zenta -w /zenta -it magwas/zenta /bin/bash

zentaworkaround:
	mkdir -p ~/.zenta/.metadata/.plugins/org.eclipse.e4.workbench/
	cp etc/workbench.xmi ~/.zenta/.metadata/.plugins/org.eclipse.e4.workbench/

recording:
	start-stop-daemon --start --background --oknodo --name flvrec --make-pidfile --pidfile /tmp/flvrec.pid --startas /usr/bin/python -- /usr/local/bin/flvrec.py -o /tmp/record.flv :0

stoprecording:
	-start-stop-daemon --stop --pidfile /tmp/flvrec.pid

