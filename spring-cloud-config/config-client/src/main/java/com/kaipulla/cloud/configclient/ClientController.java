package com.kaipulla.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class ClientController {

    @Value("${message: Hello there!}")
    String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
