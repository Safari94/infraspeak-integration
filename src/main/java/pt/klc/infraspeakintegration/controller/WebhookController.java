package pt.klc.infraspeakintegration.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;

@RestController
@Slf4j
public class WebhookController {


    @PostMapping("/api/webhook")
    public ResponseEntity<?> hookHandling(@RequestBody HashMap<String,Object> body){

        log.info(body.toString());

        return ResponseEntity.status(200).body(Collections.singletonMap("result","ok"));

    }
}
