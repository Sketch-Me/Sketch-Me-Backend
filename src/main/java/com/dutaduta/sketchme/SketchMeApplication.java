package com.dutaduta.sketchme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SketchMeApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SketchMeApplication.class);
        app.run();
    }
}
