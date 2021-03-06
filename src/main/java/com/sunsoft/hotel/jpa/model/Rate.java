package com.sunsoft.hotel.jpa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tarifas")
public class Rate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tarifa")
	private Integer idTarifa;

	private String descripcion;
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	@Column(name = "fecha_fin")
	private Date fechaFin;

	private double valor;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "tarifa")
	List<Room> habitaciones;

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "tarifa")
//	List<HotelService> servicios;
	
	public List<Room> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Room> habitaciones) {
		this.habitaciones = habitaciones;
	}

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
	
//	public List<HotelService> getServicios() {
//		return servicios;
//	}
//
//	public void setServicios(List<HotelService> servicios) {
//		this.servicios = servicios;
//	}

	@Override
	public String toString() {
		return getDescripcion();
	}
}
