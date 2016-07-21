package com.example;

import com.example.api.Person;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by okuswaha on 7/17/2016.
 */
@RestController
@EnableAutoConfiguration
public class PatronController {

    @RequestMapping("/show")
    @Produces(MediaType.APPLICATION_JSON)
    public @ResponseBody Person home() {
        return new Person("om","4512");
    }

    @RequestMapping("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public @ResponseBody String error() {
        return "Adding Patrons";
    }
}
