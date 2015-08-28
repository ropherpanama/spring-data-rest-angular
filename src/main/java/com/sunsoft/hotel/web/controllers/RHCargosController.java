package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.hotel.services.RHCargosService;
import com.sunsoft.hotel.services.dto.RHCargosDTO;

@RestController
@RequestMapping("/rh_cargos")
@Scope("request")
public class RHCargosController {
	@Autowired
	RHCargosService service;
	
	@Autowired
	DozerBeanMapper mapper;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<RHCargosDTO> list() {
        return service.findAll();
    }
}
