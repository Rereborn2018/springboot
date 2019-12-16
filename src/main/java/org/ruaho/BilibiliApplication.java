package org.ruaho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class BilibiliApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(BilibiliApplication.class, args);
    }

    @RequestMapping("/test")
    public String test() {
        return "第一个springboot项目";
    }
}
