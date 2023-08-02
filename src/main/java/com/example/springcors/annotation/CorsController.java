package com.example.springcors.annotation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CrossOrigin 어노테이션을 이용하여 CORS를 적용할 수 있음
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CorsController {

    @GetMapping("/cors")
    public String cors() {
        return "ok";
    }
}
