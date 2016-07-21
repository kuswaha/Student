package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by okuswaha on 7/17/2016.
 */
@RestController
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping("/home")
    String home() {
        return "Hello World !!!";
    }

    @RequestMapping("/error1")
    String error() {
        return "Error Occured !!!";
    }
}
