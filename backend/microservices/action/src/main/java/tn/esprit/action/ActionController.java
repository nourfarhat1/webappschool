package tn.esprit.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actions")
public class ActionController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Action Microservice!";
    }
}