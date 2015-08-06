package com.sunsoft.hotel.services.dto;

import java.util.Date;

import org.dozer.Mapping;

public class TarifasDTO {
	@Mapping("idTarifa")
	private Integer idTarifa;
	@Mapping("descripcion")
	private String descripcion;
	@Mapping("fechaInicio")
	private Date fechaInicio;
	@Mapping("fechaFin")
	private Date fechaFin;
	@Mapping("valor")
	private double valor;
	@Mapping("fechaCreacion")
	private Date fechaCreacion;
	@Mapping("fechaModificacion")
	private Date fechaModificacion;

	public Integer getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
