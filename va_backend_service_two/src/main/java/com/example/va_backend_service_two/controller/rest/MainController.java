package com.example.va_backend_service_two.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Main controller.
 * Contains mocks for testing purposes
 *
 * @author Maksim.Gerasimchuk
 * @version 1.0
 */
@RestController
public class MainController {

    /**
     * Info response entity.
     *
     * @return the response entity with mock string
     */
    @GetMapping("/info")
    public ResponseEntity<String> info(){
        return new ResponseEntity<>("This is the response from the second service: URL: /info, method: GET", HttpStatus.OK);
    }

}
