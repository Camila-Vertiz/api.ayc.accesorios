package com.ayc.accesorios.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="cliente")

public class ClienteEntity {

	@Id
	@Column(name = "idcliente")
	public int idcliente;

	@Column(name = "nombres")
	public String nombres;

	@Column(name = "apellidos")
	public String apellidos;

	@Column(name = "iddispositivo")
	public int iddispositivo;

	@Column(name = "fecharegistro")
	public Date fecharegistro;

	@Column(name = "celular")
	public String celular;
	
	@Column(name = "contrasena")
	public String contrasena;

	@Column(name = "correo")
	public String correo;

	@Column(name = "urlfoto")
	public String urlfoto;

	@Column(name = "tipodocumento")
	public int tipodocumento;
	
	@Column(name = "numerodocumento")
	public String numerodocumento;

	@Column(name = "estado")
	public int estado;

	@Column(name = "latitud")
	public float latitud;

	@Column(name = "longitud")
	public float longitud;

	public ClienteEntity() {
		super();
	}

	public ClienteEntity(int idcliente, String nombres, String apellidos, int iddispositivo, Date fecharegistro,
			String celular, String contrasena, String correo, String urlfoto, int tipodocumento, String numerodocumento,
			int estado, float latitud, float longitud) {
		super();
		this.idcliente = idcliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.iddispositivo = iddispositivo;
		this.fecharegistro = fecharegistro;
		this.celular = celular;
		this.contrasena = contrasena;
		this.correo = correo;
		this.urlfoto = urlfoto;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.estado = estado;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getIddispositivo() {
		return iddispositivo;
	}

	public void setIddispositivo(int iddispositivo) {
		this.iddispositivo = iddispositivo;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUrlfoto() {
		return urlfoto;
	}

	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
}
