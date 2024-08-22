package com.psazuredev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/msg")
    public String getMsg() {
        return "Application has been deployed to Azure-Resource-Group";
    }
}
