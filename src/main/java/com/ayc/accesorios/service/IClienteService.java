package com.ayc.accesorios.service;

import java.util.List;

import com.ayc.accesorios.entity.ClienteEntity;

public interface IClienteService {
	public List<ClienteEntity> findAll();
}
