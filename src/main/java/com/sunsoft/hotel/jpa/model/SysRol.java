package com.sunsoft.hotel.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class SysRol {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_role")
	private Integer idRol;
	@Column(name = "role")
	private String role;

	@ManyToMany
	@JoinTable(name = "roles_secciones", 
	joinColumns = {@JoinColumn(name = "id_rol", referencedColumnName = "id_role") }, 
	inverseJoinColumns = {@JoinColumn(name = "id_seccion", referencedColumnName = "id_seccion") })
	private List<AppSection> recursos;
	
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<AppSection> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<AppSection> recursos) {
		this.recursos = recursos;
	}
}
