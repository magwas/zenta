all:
	tools/script

testenv:
	docker run --rm -p 5900:5900 -v $$(pwd):/zenta -w /zenta -it magwas/zenta /bin/bash
