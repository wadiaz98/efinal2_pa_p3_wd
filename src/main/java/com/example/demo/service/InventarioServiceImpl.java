package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IBodegaRepo;
import com.example.demo.repository.IInventarioRepo;
import com.example.demo.repository.IProductoRepo;

@Service
public class InventarioServiceImpl implements IIventarioService {
	@Autowired
	private IInventarioRepo inventarioRepo;

	@Autowired
	private IProductoRepo productoRepo;

	@Autowired
	private IBodegaRepo bodegaRepo;

	@Override
	public void ingresarAlInventario(String numeroBodega, String codBarras, Integer cantidad) {
		// TODO Auto-generated method stub
		Inventario inventario = new Inventario();
		Bodega bodega = this.bodegaRepo.buscarBodega(numeroBodega);
		inventario.setBodega(bodega);
		Producto producto = this.productoRepo.buscarPorNumero(codBarras);
		inventario.setProducto(producto);
		
		this.inventarioRepo.insertar(inventario);
	}

}
