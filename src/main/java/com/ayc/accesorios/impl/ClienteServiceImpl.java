package com.ayc.accesorios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.ClienteEntity;
import com.ayc.accesorios.repository.IClienteRepository;
import com.ayc.accesorios.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	
	@Override
	public List<ClienteEntity> findAll() {
		return (List<ClienteEntity>) iClienteRepository.findAll();
	}
	

}
