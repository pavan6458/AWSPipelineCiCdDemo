package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        // forward to the static HTML file placed under src/main/resources/static/hello.html
        return "forward:/hello.html";
    }

}
