package kz.dar.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication


public class PostApiGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(PostApiGatewayApplication.class, args);
    }

}
