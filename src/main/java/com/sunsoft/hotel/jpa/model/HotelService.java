package com.sunsoft.hotel.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicios_hotel")
public class HotelService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_servicio")
	private Integer idServicio;
	@Column(name = "nombre_servicio")
	private String nombreServicio;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tarifa")
	private Rate tarifa;
	
	@Column(name = "fecha_val")
	private Date fechaVal;
	@Column(name = "fecha_anul")
	private Date fechaAnul;

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Date getFechaVal() {
		return fechaVal;
	}

	public void setFechaVal(Date fechaVal) {
		this.fechaVal = fechaVal;
	}

	public Date getFechaAnul() {
		return fechaAnul;
	}

	public void setFechaAnul(Date fechaAnul) {
		this.fechaAnul = fechaAnul;
	}

	public Rate getTarifa() {
		return tarifa;
	}

	public void setTarifa(Rate tarifa) {
		this.tarifa = tarifa;
	}
}
