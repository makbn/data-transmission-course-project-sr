package io.github.makbn.serviceregistery.controller;

import io.github.makbn.serviceregistery.domain.ResFact;
import io.github.makbn.serviceregistery.exception.InternalServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.QueryParam;

@RestController
@RequestMapping("/notify")
public class NotifyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String hello(@QueryParam("message")String message, @QueryParam("code") int code) throws InternalServerException {

        //TODO : write your own logic here and send script to client

        //test: call client test script


        return "message: "+message+" received successfully!";
    }

    @GetMapping("/client")
    public ResponseEntity<?> client(@QueryParam("name")String name) {

        Object response = restTemplate.getForEntity("http://"+name+"/terminal/",Object.class).getBody();
        return ResponseEntity.ok(ResFact.build()
        .setResult(response)
        .get());
    }
}
