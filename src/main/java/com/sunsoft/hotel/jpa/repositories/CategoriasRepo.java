package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.Category;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriasRepo extends BaseRepository<Category, Integer> {

}
