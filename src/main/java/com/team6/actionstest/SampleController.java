package com.team6.actionstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // test
    @GetMapping("/sample")
    public String sample() {
        return "Hello World!";
    }
}
