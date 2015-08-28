package com.sunsoft.hotel.services.dto;

import java.util.Date;

import org.dozer.Mapping;

public class CategoriasDTO {
	@Mapping("idCategoria")
	private Integer idCategoria;
	@Mapping("descripcion")
	private String descripcion;
	@Mapping("fechaCreacion")
	private Date fechaCreacion;
	@Mapping("fechaModificacion")
	private Date fechaModificacion;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
}
