package com.example.demo.repository;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {

	public void insertar(Producto producto);

	public Producto buscarPorNumero(String codBarras);

	public Integer actualizarStock(Integer cantidad, String codBarras);
}
