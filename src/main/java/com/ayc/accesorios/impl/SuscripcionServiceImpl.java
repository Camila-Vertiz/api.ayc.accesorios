package com.ayc.accesorios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.Suscripcion;
import com.ayc.accesorios.repository.ISuscripcionRepository;
import com.ayc.accesorios.service.ISuscripcionService;



@Service
public class SuscripcionServiceImpl implements ISuscripcionService{
	@Autowired
    private ISuscripcionRepository suscripcionRepository;

	@Override
	public void Guardar(Suscripcion suscripcion) {
		suscripcionRepository.save(suscripcion);
	}
}
