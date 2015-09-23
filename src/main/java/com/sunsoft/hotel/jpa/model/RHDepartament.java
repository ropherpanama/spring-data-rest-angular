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

@Entity(name = "rh_departamentos")
public class RHDepartament {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_departamento")
	private Integer idDepartamento;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "departamento")
	List<RHRol> cargos;

	public List<RHRol> getCargos() {
		return cargos;
	}

	public void setCargos(List<RHRol> cargos) {
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
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}
