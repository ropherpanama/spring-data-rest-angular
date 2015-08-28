package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.hotel.services.RHDepartamentosService;
import com.sunsoft.hotel.services.dto.RHDepartamentosDTO;

@RestController
@RequestMapping("/rh_deptos")
@Scope("request")
public class RHDepartamentosController {
	@Autowired
	RHDepartamentosService service;
	
	@Autowired
	DozerBeanMapper mapper;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<RHDepartamentosDTO> list() {
        return service.findAll();
    }
}
