package com.ayc.accesorios.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.Categoria;
import com.ayc.accesorios.repository.ICategoriaRepository;
import com.ayc.accesorios.service.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    private ICategoriaRepository data;
    
    @Override
    public List<Categoria> Listar() {
       return (List<Categoria>) data.findAll();
    }

    @Override
    public Optional<Categoria> ConsultarId(int id) {
       return data.findById(id);
    }

    @Override
    public void Guardar(Categoria p) {
        data.save(p);
    }

    @Override
    public void Eliminar(int id) {
        data.deleteById(id);
    }

    @Override
    public List<Categoria> Buscar(String dato) {
        return data.buscarPorTodo(dato);
    }

}
