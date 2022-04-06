package br.com.goldencross.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/hello", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorld {


    @GetMapping("/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
