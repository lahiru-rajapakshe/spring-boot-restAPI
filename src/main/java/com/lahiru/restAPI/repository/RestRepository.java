package com.lahiru.restAPI.repository;

import com.lahiru.restAPI.model.RestModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<RestModel,Integer> {

}
