package com.lahiru.restAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControl {

    @PostMapping("/add")
    public void addOrUpdateRecord(){

    }
    @GetMapping("/all")
    public void finAllRecord(){

    }
    @GetMapping("/find/{id}")
    public void findById(){

    }

    @DeleteMapping ("/delete/{id}")
    public void removeById(){

    }
}
