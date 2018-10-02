package com.test.ias.appaves.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.ias.appaves.entity.Ave;

public interface IAveDao extends CrudRepository<Ave,String>{

}
