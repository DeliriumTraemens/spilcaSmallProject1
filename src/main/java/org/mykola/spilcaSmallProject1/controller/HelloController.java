package org.mykola.spilcaSmallProject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/hola")
    public String hola() {
        return "Holaa!";
    }

    @GetMapping("/ciao")
    public String ciao() {
        return "Ciao!!";
    }
}
