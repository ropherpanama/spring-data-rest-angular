package com.sunsoft.hotel.jpa.model;

import java.math.BigDecimal;
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
@Table(name = "cobros")
public class Cobro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cobro")
	private Integer idCobro;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_reserva")
	private Reservation reserva;
	
	@Column(name = "id_empleado")
	private int empleadoId;
	@Column(name = "importe")
	private BigDecimal importe;
	@Column(name = "fecha_cobro")
	private Date fechaCobro;

	public Integer getIdCobro() {
		return idCobro;
	}

	public void setIdCobro(Integer idCobro) {
		this.idCobro = idCobro;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Date getFechaCobro() {
		return fechaCobro;
	}

	public void setFechaCobro(Date fechaCobro) {
		this.fechaCobro = fechaCobro;
	}

	public Reservation getReserva() {
		return reserva;
	}

	public void setReserva(Reservation reserva) {
		this.reserva = reserva;
	}
}
