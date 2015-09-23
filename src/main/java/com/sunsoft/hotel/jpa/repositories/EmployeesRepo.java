package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.RHEmployee;

@RepositoryRestResource(collectionResourceRel = "empleados", path = "empleados")
public interface EmployeesRepo extends BaseRepository<RHEmployee, Integer> {

}
