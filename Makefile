build-image:
	docker build -tdemo/java-spring-demo:latest -fbuild/Dockerfile .
run:
	docker run --rm -it -p8080:8080 demo/java-spring-demo:latest