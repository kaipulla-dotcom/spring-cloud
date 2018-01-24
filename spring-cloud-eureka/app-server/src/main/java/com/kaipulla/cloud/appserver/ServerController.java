package com.kaipulla.cloud.appserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/server")
public class ServerController {

    @GetMapping
    public String hello() {
        return "hello from server!";
    }
}
