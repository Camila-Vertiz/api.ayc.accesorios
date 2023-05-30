package com.ayc.accesorios.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orden")
public class Orden {
    @Id //La linea siguiente es ID
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincremental
    private int id_orden;
    private int id_usuario;
    private String numero;
    private Date fechaCreacion;
    private double total;
    
	public Orden() {
		super();
	}

	public Orden(int id_usuario, String numero, Date fechaCreacion, double total) {
		super();
		this.id_usuario = id_usuario;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.total = total;
	}

	public Orden(int id_orden, int id_usuario, String numero, Date fechaCreacion, double total) {
		super();
		this.id_orden = id_orden;
		this.id_usuario = id_usuario;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.total = total;
	}

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
