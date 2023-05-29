package com.ayc.accesorios.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToOne;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "f_verificar_producto_existente_carrito", procedureName = "f_verificar_producto_existente_carrito", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_producto", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class),
		}),
})
public class Carrito {
    @Id //La linea siguiente es ID
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincremental
    private int id_carrito;
    private int id_producto;
    private int id_usuario;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    private int estado;
    
    public Carrito() {
		super();
	}

	public Carrito(int id_carrito, int id_producto, int id_usuario, String nombre, int cantidad, double precio,
			double total, int estado) {
		super();
		this.id_carrito = id_carrito;
		this.id_producto = id_producto;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.estado=estado;
	}

	public Carrito(int id_producto, int id_usuario, String nombre, int cantidad, double precio, double total, int estado) {
		super();
		this.id_producto = id_producto;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.estado=estado;
	}

	public int getId_carrito() {
		return id_carrito;
	}

	public void setId_carrito(int id_carrito) {
		this.id_carrito = id_carrito;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}