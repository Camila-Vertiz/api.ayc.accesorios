package com.ayc.accesorios.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.DetalleOrden;

@Repository
public interface IDetalleOrdenRepository extends CrudRepository<DetalleOrden, Integer>{
	@Procedure(name = "f_listar_detalle_por_orden")
	public String f_listar_detalle_por_orden(@Param("in_id_orden") int id_orden);
}
