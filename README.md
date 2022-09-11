# java-spring-init

## Environment

- Spring Boot 2.7.3
- Java 17
- OpenApi 3 with springdoc-openapi 1.6.11
- MySQL 8.0.30 with docker compose

```shell
> docker compose up -d
[+] Running 1/1
 ⠿ test_database Pulled                                                                                                                                                                                                                 2.6s
[+] Running 2/2
 ⠿ Network java-spring-init_default  Created                                                                                                                                                                                            0.0s
 ⠿ Container mysql8.0.30             Started
```

## Feature

![image](https://user-images.githubusercontent.com/55722186/189535257-33c9b282-5b1d-4871-af78-078fb5619c3f.png)

> http://localhost:8080/swagger-ui/index.html

### OpenApi 명세화

- 복수 개의 servers 지원
- 배포 시간 versioning
- api summary 작성
