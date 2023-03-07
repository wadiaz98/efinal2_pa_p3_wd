package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping("/nuevoProducto")
	public String paginaNuevaPersona(Producto producto) {
		return "nuevoProducto";
	}

	@PostMapping("/insertar")
	public String insertarPersona(Producto producto) {
		this.productoService.guardar(producto);
		return "redirect:/productos/nuevoProducto";
	}

}