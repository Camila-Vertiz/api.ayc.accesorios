package com.ayc.accesorios.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.Carrito;

@Repository
public interface ICarritoRepository extends CrudRepository<Carrito, Integer>{
	@Procedure(name = "f_listar_carrito_por_cliente")
	public String f_listar_carrito_por_cliente(@Param("in_id_usuario") int id_usuario);
	
	@Procedure(name = "f_verificar_producto_existente_carrito")
	public String f_verificar_producto_existente_carrito(@Param("in_id_producto") int id_producto,@Param("in_id_usuario") int id_usuario);
}
