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

import com.ayc.accesorios.entity.Carrito;
import com.ayc.accesorios.entity.Categoria;
import com.ayc.accesorios.entity.DetalleOrden;
import com.ayc.accesorios.entity.Orden;
import com.ayc.accesorios.entity.Producto;
import com.ayc.accesorios.entity.Usuario;
import com.ayc.accesorios.service.ICarritoService;
import com.ayc.accesorios.service.ICategoriaService;
import com.ayc.accesorios.service.IDetalleOrdenService;
import com.ayc.accesorios.service.IOrdenService;
import com.ayc.accesorios.service.IProductoService;
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

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ICarritoService carritoService;
	
	@Autowired
	private IOrdenService ordenService;
	
	@Autowired
	private IDetalleOrdenService detalleService;

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
	
	@RequestMapping(value = "/producto/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> getProductoss() throws Exception {
		List<Producto> listaProducto = productoService.Listar();
		return ResponseEntity.ok(listaProducto);
	}
	
	@RequestMapping(value = "/producto/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarProducto(@RequestBody Producto producto) throws ParseException {
		System.out.print(producto.getId()+"  "+producto.getNombre());
		productoService.Guardar(producto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/producto/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarProducto(@PathVariable("id") int id) throws ParseException {
		System.out.print(id);
		productoService.Eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value="/producto/listar/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> listarProductoPorId(@PathVariable int id) throws Exception{
						
		String data = productoService.ConsultarId(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/carrito/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Carrito>> getCarrito() throws Exception {
		List<Carrito> listaCarrito = carritoService.Listar();
		return ResponseEntity.ok(listaCarrito);
	}
	
	@RequestMapping(value="/carrito/listar/{id_usuario}",method = RequestMethod.GET)
	public ResponseEntity<?> listarCarritoPorUsuario(@PathVariable int id_usuario) throws Exception{
						
		String data = carritoService.ConsultarIdUsuario(id_usuario);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value="/carrito/verificar/producto",method = RequestMethod.POST)
	public ResponseEntity<?> verificarProductoCarritoPorUsuario(@RequestBody Carrito carrito) throws Exception{
						
		String data = carritoService.verificarProductoExistente(carrito.getId_producto(), carrito.getId_usuario());
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/carrito/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCarrito(@RequestBody Carrito carrito) throws ParseException {
		carritoService.Guardar(carrito);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/carrito/eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarCarrito(@RequestBody Carrito carrito) throws ParseException {
		carritoService.Guardar(carrito);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/orden/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Orden>> listarOrden() throws Exception {
		List<Orden> listaOrden = ordenService.FindAll();
		return ResponseEntity.ok(listaOrden);
	}
	
	@RequestMapping(value = "/orden/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarOrden(@RequestBody Orden orden) throws ParseException {
		ordenService.Guardar(orden);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@RequestMapping(value="/orden/listar/{id_usuario}",method = RequestMethod.GET)
	public ResponseEntity<?> listarOrdenesPorUsuario(@PathVariable int id_usuario) throws Exception{
						
		String data = ordenService.ConsultarIdUsuario(id_usuario);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/detalleOrden/listar/{id_orden}", method = RequestMethod.GET)
	public ResponseEntity<?> getDetalleOrdenPorIdOrden(@PathVariable int id_orden) throws Exception {
		String data = detalleService.ConsultarIdOrden(id_orden);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/detalleOrden/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarDetalleOrden(@RequestBody DetalleOrden detalleOrden) throws ParseException {
		System.out.println(detalleOrden.getNombre());
		detalleService.Guardar(detalleOrden);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
