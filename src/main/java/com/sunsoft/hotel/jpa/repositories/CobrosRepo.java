package com.sunsoft.hotel.jpa.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.Cobro;

@RepositoryRestResource(collectionResourceRel = "cobros", path = "cobros")
public interface CobrosRepo extends BaseRepository<Cobro, Integer> {

	public List<Cobro> findByFechaCobro(@Param("fecha") Date fecha);
}
