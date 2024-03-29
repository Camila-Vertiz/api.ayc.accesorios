
package com.ayc.accesorios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincremental
    @Column(name = "id_categoria")
    private int id_categoria;
    @Column(name = "nombre")
    private String nombre;
    
    
    public Categoria(){}
    
	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	
	public Categoria(int id_categoria, String nombre) {
		this.id_categoria = id_categoria;
		this.nombre = nombre;
	}

	public int getId() {
		return id_categoria;
	}
	public void setId(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
    
    
}
