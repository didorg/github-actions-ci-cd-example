package com.didorg.githubactionscicdexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping(value = "/")
    public String sayHi(){
        return "Hi :)";
    }
}
