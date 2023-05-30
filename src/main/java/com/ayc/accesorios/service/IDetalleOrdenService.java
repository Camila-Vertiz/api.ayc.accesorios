package com.ayc.accesorios.service;

import java.util.List;

import com.ayc.accesorios.entity.DetalleOrden;

public interface IDetalleOrdenService {
	public List<DetalleOrden> Listar();
	public String ConsultarIdOrden(int id_orden);
    public void Guardar(DetalleOrden dt); //Tambien se usa para actualizar
}
