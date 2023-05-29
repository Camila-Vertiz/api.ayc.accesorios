package com.ayc.accesorios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.Carrito;
import com.ayc.accesorios.repository.ICarritoRepository;
import com.ayc.accesorios.service.ICarritoService;

@Service
public class CarritoServiceImpl implements ICarritoService{

    @Autowired
    private ICarritoRepository carritoRepository;
    
    @Override
    public void Guardar(Carrito dt) {
    	carritoRepository.save(dt);
    }

	@Override
	public List<Carrito> Listar() {
		return (List<Carrito>) carritoRepository.findAll();
	}

	@Override
	public String ConsultarIdUsuario(int id_usuario) {
		return carritoRepository.f_listar_carrito_por_cliente(id_usuario);
	}

	@Override
	public String verificarProductoExistente(int id_producto, int id_usuario) {
		return carritoRepository.f_verificar_producto_existente_carrito(id_producto,id_usuario);
	}
    
}
