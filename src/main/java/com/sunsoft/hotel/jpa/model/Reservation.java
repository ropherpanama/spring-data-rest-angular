package com.sunsoft.hotel.jpa.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_reserva")
	private Integer idReserva;

	@Column(name = "cantidad_dias")
	private int cantDias;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_empleado")
	private RHEmployee empleado;// solo un empleado la realiza

	@Column(name = "infantes")
	private int menores;
	@Column(name = "adultos")
	private int adultos;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Client cliente;// solo un cliente hace una reserva

	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	@Column(name = "total")
	private BigDecimal total;
	
	@ManyToMany
	@JoinTable(name = "habitaciones_reserva", 
	joinColumns = {@JoinColumn(name = "reserva_id", referencedColumnName = "id_reserva") }, 
	inverseJoinColumns = {@JoinColumn(name = "habitacion_id", referencedColumnName = "id_habitacion") })
	private List<Room> habitaciones;
	
	@ManyToMany
	@JoinTable(name = "reserva_servicios", 
	joinColumns = {@JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva") }, 
	inverseJoinColumns = {@JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio") })
	private List<HotelService> servicios;

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "reserva")
	private Cobro cobro;
	
	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public RHEmployee getEmpleado() {
		return empleado;
	}

	public void setEmpleado(RHEmployee empleado) {
		this.empleado = empleado;
	}

	public int getMenores() {
		return menores;
	}

	public void setMenores(int menores) {
		this.menores = menores;
	}

	public int getAdultos() {
		return adultos;
	}

	public void setAdultos(int adultos) {
		this.adultos = adultos;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<Room> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Room> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public List<HotelService> getServicios() {
		return servicios;
	}

	public void setServicios(List<HotelService> servicios) {
		this.servicios = servicios;
	}

	public Cobro getCobro() {
		return cobro;
	}

	public void setCobro(Cobro cobro) {
		this.cobro = cobro;
	}
}
