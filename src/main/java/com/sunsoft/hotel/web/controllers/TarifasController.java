package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.hotel.services.TarifasService;
import com.sunsoft.hotel.services.dto.TarifasDTO;

@RestController
@RequestMapping("/tarifas")
@Scope("request")
public class TarifasController {

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private TarifasService service;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TarifasDTO> tarifasList() {
        return service.findAll();
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(TarifasDTO t) {
    	System.out.println(t.toString());
    	service.save(t); 
    }
}    

 