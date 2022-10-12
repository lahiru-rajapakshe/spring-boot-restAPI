package com.lahiru.restAPI.controller;

import com.lahiru.restAPI.model.RestModel;
import com.lahiru.restAPI.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Iterable<RestModel> finAllRecord(){
        return restService.findAll();
    }
    @GetMapping("/find/{id}")
    public RestModel findById(@PathVariable Integer id){
        return restService.findById(id);


    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> removeById(@PathVariable Integer id){
        RestModel rm = restService.findById(id);
        restService.delete(rm);
        return  new ResponseEntity<String>("Deleted ", HttpStatus.OK);

    }
}
