package com.lahiru.restAPI.controller;

import com.lahiru.restAPI.model.RestModel;
import com.lahiru.restAPI.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControl {

    @Autowired
    private RestService restService;

    @PostMapping("/add")
    public RestModel addOrUpdateRecord(@RequestBody RestModel restModel){

        return restService.addBLMethod(restModel);
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
