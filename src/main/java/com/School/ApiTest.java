package com.School;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class ApiTest {
    @GetMapping("/hello")
    public String test() {
        return "hrllo world3";
    }
}
