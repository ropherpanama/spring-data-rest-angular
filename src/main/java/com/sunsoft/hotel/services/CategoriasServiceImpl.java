package com.sunsoft.hotel.services;

import org.springframework.stereotype.Service;

import com.sunsoft.hotel.jpa.model.Categorias;
import com.sunsoft.hotel.services.dto.CategoriasDTO;

@Service
public class CategoriasServiceImpl extends GenericServiceImpl<Categorias, CategoriasDTO, Integer> implements CategoriasService{

}
