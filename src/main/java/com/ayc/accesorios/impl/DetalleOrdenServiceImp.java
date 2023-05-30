package com.ayc.accesorios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.DetalleOrden;
import com.ayc.accesorios.repository.IDetalleOrdenRepository;
import com.ayc.accesorios.service.IDetalleOrdenService;

@Service
public class DetalleOrdenServiceImp implements IDetalleOrdenService{

    @Autowired
    private IDetalleOrdenRepository detalleOrdenRepository;
    
    @Override
    public void Guardar(DetalleOrden dt) {
        detalleOrdenRepository.save(dt);
    }

	@Override
	public List<DetalleOrden> Listar() {
		return (List<DetalleOrden>) detalleOrdenRepository.findAll();
	}

	@Override
	public String ConsultarIdOrden(int id_orden) {
		return detalleOrdenRepository.f_listar_detalle_por_orden(id_orden);
	}
    
}
