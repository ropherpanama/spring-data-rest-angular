package com.sunsoft.hotel.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.Room;

@RepositoryRestResource(collectionResourceRel = "habitaciones", path = "habitaciones")
public interface HabitacionesRepo extends BaseRepository<Room, Integer> {
	
	@Query("select r from Room r where r.estado.idEstado = 2")
	public List<Room> availableRooms();
}
