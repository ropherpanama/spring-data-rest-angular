package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.SysRol;

@RepositoryRestResource(collectionResourceRel = "sysroles", path = "sysroles")
public interface RolesRepo extends BaseRepository<SysRol, Integer>{

}
