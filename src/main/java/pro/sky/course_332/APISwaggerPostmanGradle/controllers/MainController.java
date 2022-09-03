package pro.sky.course_332.APISwaggerPostmanGradle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String testAPI() {
        return "WebApp is working!";
    }
}
