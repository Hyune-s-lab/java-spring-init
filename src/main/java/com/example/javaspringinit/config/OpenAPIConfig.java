package com.example.javaspringinit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI openAPI() {
        final List<Server> servers = List.of(new Server().url("http://localhost:8080"));

        return new OpenAPI()
                .info(new Info()
                        .title("Init project with Java spring boot")
                        .version(LocalDateTime.now().toString()))
                .servers(servers);

    }
}
