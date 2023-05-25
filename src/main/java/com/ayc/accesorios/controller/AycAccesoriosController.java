package com.ayc.accesorios.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayc.accesorios.entity.ClienteEntity;
import com.ayc.accesorios.entity.Usuario;
import com.ayc.accesorios.impl.ClienteServiceImpl;
import com.ayc.accesorios.impl.UsuarioServiceImpl;
import com.ayc.accesorios.service.IClienteService;
import com.ayc.accesorios.service.IUsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class AycAccesoriosController {

	@Autowired
	private IUsuarioService usuarioService;

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

}
