package com.example.demo.service;

import com.example.demo.modelo.Bodega;

public interface IBodegaService {

	public void guardar(Bodega bodega);

	public Bodega buscarBodega(String numero);
}
