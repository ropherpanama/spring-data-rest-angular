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
@Table(name = "users")
public class SysUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_user")
	private Integer idUser;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;

	@ManyToMany
	@JoinTable(name = "user_roles", joinColumns = {
	@JoinColumn(name = "user_id", referencedColumnName = "id_user") }, inverseJoinColumns = {
	@JoinColumn(name = "role_id", referencedColumnName = "id_role") })
	private List<SysRol> sysRol;

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<SysRol> getSysRol() {
		return sysRol;
	}

	public void setSysRol(List<SysRol> sysRol) {
		this.sysRol = sysRol;
	}
}
