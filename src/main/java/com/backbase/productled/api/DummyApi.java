package com.backbase.productled.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller class to receive HTTP requests and trigger arrangements sync
 */
@RestController
public class DummyApi {

    @GetMapping("/hello")
    public String hello() {
        return "Hello dummy api";
    }
}
