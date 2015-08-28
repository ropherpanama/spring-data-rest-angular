package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.hotel.services.CategoriasService;
import com.sunsoft.hotel.services.dto.CategoriasDTO;

@RestController
@RequestMapping("/categorias")
@Scope("request")
public class CategoriasController {

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private CategoriasService service;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<CategoriasDTO> list() {
        return service.findAll();
    }
}
