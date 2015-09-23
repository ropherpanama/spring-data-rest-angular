package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.RHRol;

@RepositoryRestResource(collectionResourceRel = "rhcargos", path = "rhcargos")
public interface RHCargosRepo extends BaseRepository<RHRol, Integer>{

}
