package com.kaipulla.cloud.appclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String hello() {
        String url = "http://app-server/rest/server";
        return restTemplate.getForObject(url, String.class);
    }
}
