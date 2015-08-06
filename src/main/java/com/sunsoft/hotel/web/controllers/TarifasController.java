package com.sunsoft.hotel.web.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sunsoft.hotel.services.TarifasService;
import com.sunsoft.hotel.services.dto.TarifasDTO;

@RestController
@RequestMapping("/tarifas")
@Scope("request")
public class TarifasController {

    private static final Logger logger = LoggerFactory.getLogger(TarifasController.class);

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private TarifasService tarifasService;

    @Autowired
    private MessageSource ms;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TarifasDTO> tarifasList() {
        logger.debug("get json tarifas list");
        return tarifasService.findAll();
    }    
}    

 