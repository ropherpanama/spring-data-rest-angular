package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.InfoHotel;

@RepositoryRestResource(collectionResourceRel = "info", path = "info")
public interface InfoHotelRepo extends BaseRepository<InfoHotel, Integer> {

}
