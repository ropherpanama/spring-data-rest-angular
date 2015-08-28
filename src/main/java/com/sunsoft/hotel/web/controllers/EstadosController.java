package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.hotel.services.EstadosService;
import com.sunsoft.hotel.services.dto.EstadosDTO;

@RestController
@RequestMapping("/estados")
@Scope("request")
public class EstadosController {

	@Autowired
	private EstadosService service;
	
	@Autowired
    private DozerBeanMapper mapper;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<EstadosDTO> list() {
        return service.findAll();
    }
	
	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
	public EstadosDTO findById(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody EstadosDTO t) {
    	System.out.println(t.toString());
    	service.save(t);
    }
}
