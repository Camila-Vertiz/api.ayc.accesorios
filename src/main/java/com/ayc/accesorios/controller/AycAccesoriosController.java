package com.ayc.accesorios.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayc.accesorios.entity.Categoria;
import com.ayc.accesorios.entity.Usuario;
import com.ayc.accesorios.service.ICategoriaService;
import com.ayc.accesorios.service.IUsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class AycAccesoriosController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private ICategoriaService categoriaService;

	@RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getClientes() throws Exception {
		System.out.println("Hola");
		List<Usuario> listaClientes = usuarioService.ListarClientes("USER");

		return ResponseEntity.ok(listaClientes);

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> verificarUsuario(@RequestBody Usuario usuario) throws ParseException {
		String data = usuarioService.verificarUsuario(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value="/usuario/listar/{idusuario}",method = RequestMethod.GET)
	public ResponseEntity<?> listarusuarioPorId(@PathVariable int idusuario) throws Exception{
						
		String data = usuarioService.ConsultarId(idusuario);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/usuario/existe", method = RequestMethod.POST)
	public ResponseEntity<?> verificarUsuarioExistente(@RequestBody Usuario usuario) throws ParseException {
		System.out.println("entra con correo:" + usuario.getEmail());
		String data = usuarioService.verificarUsuarioExistente(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/usuario/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarUsuario(@RequestBody Usuario usuario) throws ParseException {
        usuarioService.Guardar(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/categoria/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> getCategorias() throws Exception {
		List<Categoria> listaCategoria = categoriaService.Listar();
		return ResponseEntity.ok(listaCategoria);
	}
	
	@RequestMapping(value = "/categoria/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCategoria(@RequestBody Categoria categoria) throws ParseException {
		System.out.print(categoria.getId_categoria()+"  "+categoria.getNombre());
		categoriaService.Guardar(categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/categoria/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarCategoria(@RequestBody Categoria categoria) throws ParseException {
		System.out.print(categoria);
		categoriaService.Guardar(categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/categoria/eliminar/{id_categoria}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarCategoria(@PathVariable("id_categoria") int id_categoria) throws ParseException {
		System.out.print(id_categoria);
		categoriaService.Eliminar(id_categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
