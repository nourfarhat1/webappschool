package tn.esprit.tip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tips")
public class TipController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Tip Microservice!";
    }
}
