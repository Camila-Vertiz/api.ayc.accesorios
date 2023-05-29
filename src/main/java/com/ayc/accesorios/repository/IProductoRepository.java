package com.ayc.accesorios.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.Producto;

@Repository //sirve como repositorio en la BD
                                   //Metodos para el CRUD
public interface IProductoRepository extends CrudRepository<Producto, Integer>{ 
	@Procedure(name = "f_listar_producto_por_id")
	public String f_listar_producto_por_id(@Param("in_id_producto") int idusuario);
}
