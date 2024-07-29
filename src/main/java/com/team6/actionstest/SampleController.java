package com.team6.actionstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // test
    @RequestMapping("/sample")
    public String sample() {
        return "Hello World!";
    }
}
