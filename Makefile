all:
	tools/script

testenv:
	docker run -p 5900:5900 -v $$(pwd):/zenta -it magwas/edemotest:zentabuild /bin/bash
