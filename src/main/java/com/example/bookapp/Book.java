package com.example.bookapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Book {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola desde mi app";
    }

}
