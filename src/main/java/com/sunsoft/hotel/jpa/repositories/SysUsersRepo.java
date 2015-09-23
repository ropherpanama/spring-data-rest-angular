package com.sunsoft.hotel.jpa.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sunsoft.hotel.jpa.model.SysUser;

@RepositoryRestResource(collectionResourceRel = "sysusers", path = "sysusers")
public interface SysUsersRepo extends BaseRepository<SysUser, Integer> {

}
