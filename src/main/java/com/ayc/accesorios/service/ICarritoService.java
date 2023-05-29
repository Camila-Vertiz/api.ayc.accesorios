package com.ayc.accesorios.service;

import java.util.List;

import com.ayc.accesorios.entity.Carrito;
import com.ayc.accesorios.entity.Usuario;

public interface ICarritoService {
	public List<Carrito> Listar();
	public String ConsultarIdUsuario(int id_usuario);
	public String verificarProductoExistente(int id_producto, int id_usuario);
    public void Guardar(Carrito dt); //Tambien se usa para actualizar
}
