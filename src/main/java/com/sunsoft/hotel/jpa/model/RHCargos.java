package com.sunsoft.hotel.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "rh_cargos")
public class RHCargos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cargo")
	private Integer idCargo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_departamento", nullable = false)
	private RHDepartamentos departamento;

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

	public RHDepartamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(RHDepartamentos departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}
