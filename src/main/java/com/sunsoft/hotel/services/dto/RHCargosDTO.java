package com.sunsoft.hotel.services.dto;

import java.util.Date;

import org.dozer.Mapping;

public class RHCargosDTO {
	@Mapping(value = "idCargo")
	private Integer idCargo;
	@Mapping(value = "nombre")
	private String nombre;
	@Mapping(value = "fechaCreacion")
	private Date fechaCreacion;
	@Mapping(value = "fechaModificacion")
	private Date fechaModificacion;
	@Mapping(value = "departamento")
	private String departamento;

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
