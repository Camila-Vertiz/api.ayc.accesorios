package com.ayc.accesorios.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.Categoria;

@Repository
public interface ICategoriaRepository extends CrudRepository<Categoria,Integer> {
    
	@Query(value="SELECT * FROM categoria "
            + "WHERE LOWER(nombre) LIKE LOWER(CONCAT('%', ?1, '%')) "
            ,nativeQuery=true)
    List<Categoria> buscarPorTodo(String dato);
    
    @Query(value="SELECT * FROM categoria "
            + "ORDER BY nombre ASC",nativeQuery=true)
    List<Categoria> OrderAsc();
    
    @Query(value="SELECT * FROM categoria "
            + "ORDER BY nombre DESC",nativeQuery=true)
    List<Categoria> OrderDesc();
}
