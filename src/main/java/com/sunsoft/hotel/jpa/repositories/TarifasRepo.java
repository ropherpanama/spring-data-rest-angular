package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.Rate;

@RepositoryRestResource(collectionResourceRel = "tarifas", path = "tarifas")
public interface TarifasRepo extends BaseRepository<Rate, Integer> {
}