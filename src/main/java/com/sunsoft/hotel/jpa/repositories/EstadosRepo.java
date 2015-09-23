package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.State;

@RepositoryRestResource(collectionResourceRel = "estados", path = "estados")
public interface EstadosRepo extends BaseRepository<State, Integer>{

}
