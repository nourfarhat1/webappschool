package tn.esprit.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/classes")
public class SchoolController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from School Microservice!";
    }
}