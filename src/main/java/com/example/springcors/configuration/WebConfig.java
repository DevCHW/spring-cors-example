package com.example.springcors.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * addMapping() default 값
         * Allow all origins
         * Allow "simple" methods GET, HEAD and POST
         * Allow all headers
         * Set max age to 1800 seconds (30 minutes)
         */

        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET", "POST")
                .maxAge(3000);

        /**
         * 위 설정은 Origin은 http://localhost:8080, 허용할 메소드는 GET, POST 최대 캐싱 시간은 3000초로 설정한 것
         * 이렇게 하면 전체 글로벌 설정으로 CORS를 적용한 것임.
         */
    }
}
