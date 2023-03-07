package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo productoRepo;

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		Producto aux = this.productoRepo.buscarPorNumero(producto.getCodigoBarras());
		if (aux == null) {
			producto.setStock(0);
			this.productoRepo.insertar(producto);
		} else {
			Integer cantidadTotal = aux.getStock() + producto.getStock();
			this.productoRepo.actualizarStock(cantidadTotal, aux.getCodigoBarras());
		}
	}

	@Override
	public void buscarProducto(String codBarras) {
		// TODO Auto-generated method stub
		this.productoRepo.buscarPorNumero(codBarras);
	}

}
