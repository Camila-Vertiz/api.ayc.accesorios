package com.ayc.accesorios.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.Producto;
import com.ayc.accesorios.repository.IProductoRepository;
import com.ayc.accesorios.service.IProductoService;

@Service //Para poder implementar los metodos definidos en la interfaz
public class ProductoServiceImpl implements IProductoService{

    @Autowired //Permite declarar variable tipo interfaz
    private IProductoRepository data; //Mismo nombre del repositorio, permite acceder a la conexion con bd
    
    @Override
    public List<Producto> Listar() {
         return (List<Producto>) data.findAll();
    }

    @Override
    public String ConsultarId(int id) {
        return data.f_listar_producto_por_id(id);
    }

    @Override
    public void Guardar(Producto p) {
        data.save(p);
    }

    @Override
    public void Eliminar(int id) {
        data.deleteById(id);
    }
}
