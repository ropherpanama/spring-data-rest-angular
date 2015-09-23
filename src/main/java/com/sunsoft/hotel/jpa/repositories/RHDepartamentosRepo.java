package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.RHDepartament;

@RepositoryRestResource(collectionResourceRel = "rhareas", path = "rhareas")
public interface RHDepartamentosRepo extends BaseRepository<RHDepartament, Integer>{

}
