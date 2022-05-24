package co.develhope.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.StringBuilder;

@RestController
public class NameController {

    private String name = "Sonia";
    StringBuilder reverseName = new StringBuilder("Sonia");

    @GetMapping("/name")
    public String getName(){
        return name;
    }

    @PostMapping("/name")
    public StringBuilder reverseName(){
        return reverseName.reverse();
    }
}
