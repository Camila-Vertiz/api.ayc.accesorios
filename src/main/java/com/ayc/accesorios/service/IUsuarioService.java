package com.ayc.accesorios.service;

import java.util.List;
import java.util.Optional;

import com.ayc.accesorios.entity.Usuario;

public interface IUsuarioService {
    //  Declaracion de los metodos a usar
    public List<Usuario> Listar();
    public List<Usuario> ListarClientes(String tipo);
    public String ConsultarId(int id); //Devuelve una entidad al consultar
    public void Guardar(Usuario p); //Tambien se usa para actualizar
    public void Eliminar (int id);
    public List<Usuario> Buscar(String dato);
    public String verificarUsuario(Usuario usuario);
    public List<Usuario> ListarTipo(String dato);
}
