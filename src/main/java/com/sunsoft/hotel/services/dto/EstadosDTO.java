package com.sunsoft.hotel.services.dto;

import org.dozer.Mapping;

public class EstadosDTO {
	@Mapping("idEstado")
	private Integer idEstado;
	@Mapping("descripcion")
	private String descripcion;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
