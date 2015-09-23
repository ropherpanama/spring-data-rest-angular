package com.sunsoft.hotel.jpa.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import com.sunsoft.hotel.jpa.model.Reservation;

@RepositoryRestResource(collectionResourceRel = "reservas", path = "reservas")
public interface ReservationsRepo extends BaseRepository<Reservation, Integer> {
	
	@Query("select r from Reservation r where r.fecha >= (:dateFrom) and r.fecha <= (:dateTo)")
	public List<Reservation> findByDateRange(@Param("dateFrom") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateFrom, @Param("dateTo") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateTo);
}
