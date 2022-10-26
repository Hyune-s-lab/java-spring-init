# java-spring-init

## Environment

- Spring Boot 2.7.3
- Java 17
- OpenApi 3 with springdoc-openapi 1.6.11
- MySQL 8.0.30 with docker compose

```shell
> ./run.sh
> docker ps 
CONTAINER ID   IMAGE              COMMAND                  CREATED         STATUS         PORTS                               NAMES
e911fb32a2ef   java-spring-init   "java -jar /app.jar"     5 minutes ago   Up 2 seconds   0.0.0.0:8080->8080/tcp              java-spring-init-java-spring-init-1
96557fa4df03   mysql:8.0.30       "docker-entrypoint.s…"   5 minutes ago   Up 2 seconds   0.0.0.0:3306->3306/tcp, 33060/tcp   mysql8.0.30

```

## Feature

![image](https://user-images.githubusercontent.com/55722186/189535257-33c9b282-5b1d-4871-af78-078fb5619c3f.png)

> http://localhost:8080/swagger-ui/index.html

### OpenApi 명세화

- 복수 개의 servers 지원
- 배포 시간 versioning
- api summary 작성
