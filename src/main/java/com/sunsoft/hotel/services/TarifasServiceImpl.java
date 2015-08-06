package com.sunsoft.hotel.services;

import org.springframework.stereotype.Service;

import com.sunsoft.hotel.jpa.model.Tarifas;
import com.sunsoft.hotel.services.dto.TarifasDTO;

@Service
public class TarifasServiceImpl extends GenericServiceImpl<Tarifas, TarifasDTO, Integer> implements TarifasService {}