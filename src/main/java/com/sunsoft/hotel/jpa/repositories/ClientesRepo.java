package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.Client;

@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes")
public interface ClientesRepo extends BaseRepository<Client, Integer> {

	public Client findByEmail(@Param("email") String email);

	public Client findByPersonalId(@Param("dni") String dni);
}
