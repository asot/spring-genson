package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("genson")
public class Controller {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> test() {
        return Map.of("message", "Hello World!");
    }
}
