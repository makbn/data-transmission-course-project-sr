package io.github.makbn.serviceregistery.controller;

import io.github.makbn.serviceregistery.domain.ResFact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.QueryParam;

@RestController
@RequestMapping("/notify")
public class NotifyController {


    @GetMapping("/")
    public ResponseEntity<?> hello(@QueryParam("message")String message, @QueryParam("code") int code) throws InternalServerException {

        //TODO : write your own logic here and send script to client

        //test: call client test script

        ResponseEntity response = new RestTemplate().getForEntity("http://client-service/terminal/",ResponseEntity.class).getBody();

        System.out.println("Response Received as " + response);

        return ResponseEntity.ok(ResFact.<String>build()
                .setResult("message: "+message+" received successfully!").get());
    }
}
