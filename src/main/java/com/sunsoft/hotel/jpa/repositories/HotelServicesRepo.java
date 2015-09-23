package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.HotelService;

@RepositoryRestResource(collectionResourceRel = "hotel_servs", path = "hotel_servs")
public interface HotelServicesRepo extends BaseRepository<HotelService, Integer> {

}
