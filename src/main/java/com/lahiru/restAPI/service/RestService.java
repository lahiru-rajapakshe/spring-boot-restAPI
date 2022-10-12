package com.lahiru.restAPI.service;

import com.lahiru.restAPI.model.RestModel;
import com.lahiru.restAPI.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    @Autowired
    private RestRepository restRepository;
public RestModel addBLMethod(RestModel restModel){
return restRepository.save(restModel);
}

    public Iterable<RestModel> findAll() {
    return restRepository.findAll();
    }
}
