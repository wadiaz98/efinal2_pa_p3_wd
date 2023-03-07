package com.example.demo.repository;

import com.example.demo.modelo.Bodega;

public interface IBodegaRepo {

	public void insertar(Bodega bodega);

	public Bodega buscarBodega(String numero);
}
