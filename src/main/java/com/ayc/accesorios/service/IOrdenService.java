package com.ayc.accesorios.service;

import java.util.List;
import java.util.Optional;

import com.ayc.accesorios.entity.Orden;
import com.ayc.accesorios.entity.Usuario;

public interface IOrdenService {
    public List<Orden> FindAll();
    public void Guardar(Orden orden); //Tambien se usa para actualizar
    public String generarNumeroOrden();
    public List<Orden> findByUsuario(Usuario usuario);
    public Optional<Orden> findById(Integer id);
    public float montoTotal();
    public int cantidadOrdenes();
    public List<Orden> findByDate(String dato);
    public List<Orden> OrderAsc();
    public List<Orden> OrderDesc();
    public int VentasPorProducto(Integer id);
    public int VentasPorCliente(Integer id);
}
