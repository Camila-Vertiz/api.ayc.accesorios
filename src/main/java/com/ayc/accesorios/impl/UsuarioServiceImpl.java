package com.ayc.accesorios.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayc.accesorios.entity.Usuario;
import com.ayc.accesorios.repository.IUsuarioRepository;
import com.ayc.accesorios.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> Listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public String ConsultarId(int id) {
    	return usuarioRepository.f_listar_usuario_por_id(id);
    }
    
    @Override
    public void Guardar(Usuario u) {
        usuarioRepository.save(u);
    }

    @Override
    public void Eliminar(int id) {
      usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> Buscar(String dato) {
        return usuarioRepository.buscarPorTodo(dato);
    }

    @Override
    public String verificarUsuario(Usuario usuario) {
    	return usuarioRepository.f_verificar_usuario(usuario.getEmail(), usuario.getPassword());
    }

    @Override
    public List<Usuario> ListarTipo(String dato) {
        return usuarioRepository.listarTipo(dato);
    }

	@Override
	public List<Usuario> ListarClientes(String tipo) {
		return usuarioRepository.listaClientes(tipo);
	}
}
