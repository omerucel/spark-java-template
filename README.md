Project template for spark micro framework with docker support.

```bash
$ ./gradlew clean
$ ./gradlew fatJar
$ docker build -t project .
$ docker run -d -e "PROJECT_PORT=8080" -p 127.0.0.1:8080 project
```