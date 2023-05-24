package com.ayc.accesorios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.Suscripcion;


@Repository
public interface ISuscripcionRepository extends CrudRepository<Suscripcion, Integer>{

}
