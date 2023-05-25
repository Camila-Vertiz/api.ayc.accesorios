package com.ayc.accesorios.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ayc.accesorios.entity.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
	// Aqui se pueden crear otros metodos
	@Query(value = "SELECT * FROM usuario " + "WHERE usuario.nombre LIKE %?1% " + "OR username LIKE %?1% "
			+ "OR email LIKE %?1% " + "OR direccion LIKE %?1% " + "OR telefono LIKE %?1% "
			+ "OR tipo LIKE %?1%", nativeQuery = true)
	List<Usuario> buscarPorTodo(String dato);

	@Query(value = "SELECT * FROM usuario where tipo LIKE %?1%", nativeQuery = true)
	List<Usuario> listaClientes(String tipo);

	@Query(value = "SELECT * FROM usuario " + "WHERE tipo =?1", nativeQuery = true)
	List<Usuario> listarTipo(String dato);

	@Procedure(name = "f_verificar_usuario")
	public String f_verificar_usuario(@Param("in_email") String email, @Param("in_contra") String password);
	
	@Procedure(name = "f_listar_usuario_por_id")
	public String f_listar_usuario_por_id(@Param("in_id_usuario") int idusuario);
	
	@Procedure(name = "f_verificar_usuario_existente")
	public String f_verificar_usuario_existente(@Param("in_email") String email);

}
