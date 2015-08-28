package com.sunsoft.hotel.services;

import org.springframework.stereotype.Service;

import com.sunsoft.hotel.jpa.model.Estados;
import com.sunsoft.hotel.services.dto.EstadosDTO;

@Service
public class EstadosServiceImpl extends GenericServiceImpl<Estados, EstadosDTO, Integer> implements EstadosService{
}
