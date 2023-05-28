package com.ayc.accesorios.service;

import java.util.List;
import java.util.Optional;

import com.ayc.accesorios.entity.Categoria;

public interface ICategoriaService {
    
    public List<Categoria> Listar();
    public Optional<Categoria> ConsultarId(int id);
    public void Guardar(Categoria p);
    public void Eliminar(int id);
    public List<Categoria> Buscar(String dato);
    
}
