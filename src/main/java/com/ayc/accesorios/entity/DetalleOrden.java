package com.ayc.accesorios.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_orden")
public class DetalleOrden {
    @Id //La linea siguiente es ID
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincremental
    private int id_detalle_orden;
    private int id_producto;
    private int id_orden;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    
    public DetalleOrden() {
		super();
	}

	public DetalleOrden(int id_detalle_orden, int id_producto, int id_orden, String nombre, int cantidad, double precio,
			double total) {
		super();
		this.id_detalle_orden = id_detalle_orden;
		this.id_producto = id_producto;
		this.id_orden = id_orden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public DetalleOrden(int id_producto, int id_orden, String nombre, int cantidad, double precio, double total) {
		super();
		this.id_producto = id_producto;
		this.id_orden = id_orden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public int getId_detalle_orden() {
		return id_detalle_orden;
	}

	public void setId_detalle_orden(int id_detalle_orden) {
		this.id_detalle_orden = id_detalle_orden;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
    
}