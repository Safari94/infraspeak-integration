package pt.klc.infraspeakintegration.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;

@RestController
@Slf4j
public class WebhookController {


    @PostMapping("/api/webhook")
    public ResponseEntity<?> hookHandling(@RequestHeader("Authorization") String authorization, @RequestBody HashMap<String,Object> body){

        if(authorization.equals("Bearer 1ueUgdACc94iWBkuwe7OvHltuLoxJ42BOI2sbzFUdcem38EOQLM98O33DoZ1vpRV")){log.info(body.toString());

            return ResponseEntity.status(200).body(Collections.singletonMap("result","ok"));}

        else{

            return ResponseEntity.status(401).body(Collections.singletonMap("result","Invalid token provided"));
        }



    }
}
