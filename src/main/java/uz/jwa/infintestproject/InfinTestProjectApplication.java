package uz.jwa.infintestproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class InfinTestProjectApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(InfinTestProjectApplication.class, args);
    }
    
}
