package com.ayc.accesorios.service;

import java.util.List;
import java.util.Optional;

import com.ayc.accesorios.entity.Producto;

public interface IProductoService {
//  Declaracion de los metodos a usar
    public List<Producto> Listar();
    public String ConsultarId(int id); //Devuelve una entidad al consultar
    public void Guardar(Producto p); //Tambien se usa para actualizar
    public void Eliminar (int id);
}
