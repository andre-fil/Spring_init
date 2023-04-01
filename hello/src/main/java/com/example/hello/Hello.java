package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @GetMapping("/hello/{nome}")
    public String hello(@PathVariable("nome") String nome){
          return "Hello World ! " + nome;
    }
    
}
