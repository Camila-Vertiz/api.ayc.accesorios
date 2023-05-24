package com.ayc.accesorios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.DetalleOrden;

@Repository
public interface IDetalleOrdenRepository extends CrudRepository<DetalleOrden, Integer>{
    
}
