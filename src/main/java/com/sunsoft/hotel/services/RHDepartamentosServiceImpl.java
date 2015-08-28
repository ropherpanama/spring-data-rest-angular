package com.sunsoft.hotel.services;

import org.springframework.stereotype.Service;

import com.sunsoft.hotel.jpa.model.RHDepartamentos;
import com.sunsoft.hotel.services.dto.RHDepartamentosDTO;

@Service
public class RHDepartamentosServiceImpl extends GenericServiceImpl<RHDepartamentos, RHDepartamentosDTO, Integer> implements RHDepartamentosService{

}
