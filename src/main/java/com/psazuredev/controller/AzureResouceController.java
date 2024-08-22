package com.psazuredev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureResouceController {

    @GetMapping("/msg")
    public String getMsg() {
        return "Hello from Azure";
    }
}
