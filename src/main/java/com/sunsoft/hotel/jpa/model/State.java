package com.sunsoft.hotel.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "estados")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_estado")
	private Integer idEstado;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "comentario")
	private String comentario;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "estado")
	private List<Room> habitaciones;

	public List<Room> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Room> habitaciones) {
		this.habitaciones = habitaciones;
	}

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
	
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return getDescripcion();
	}
}
