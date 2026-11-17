package com.workshop.rewardservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RewardController {

    @GetMapping("/reward")
    public String getRewardGreeting() {
        return "Hello from reward";
    }
}