package com.sunsoft.hotel.services.dto;

import java.util.Date;
import java.util.List;

import org.dozer.Mapping;

public class RHDepartamentosDTO {
	@Mapping("idDepartamento")
	private Integer idDepartamento;
	@Mapping("nombre")
	private String nombre;
	@Mapping("fechaCreacion")
	private Date fechaCreacion;
	@Mapping("fechaModificacion")
	private Date fechaModificacion;
	@Mapping("cargos")
	private List<String> cargos;

	public List<String> getCargos() {
		return cargos;
	}

	public void setCargos(List<String> cargos) {
		this.cargos = cargos;
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
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
}
