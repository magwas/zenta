all:
	tools/script

testenv:
	docker run --rm -p 5900:5900 -v $$(pwd):/zenta -it magwas/zenta /bin/bash
