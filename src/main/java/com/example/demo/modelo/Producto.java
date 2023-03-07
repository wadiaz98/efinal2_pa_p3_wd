package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(generator = "seq_prod", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_prod", sequenceName = "seq_prod")
	@Column(name = "prod_id")
	private Integer id;

	@Column(name = "prod_nombre")
	private String nombre;

	@Column(name = "codigo_barras")
	private String codigoBarras;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "prod_stock")
	private Integer stock;

	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventario;

	// To String

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigoBarras=" + codigoBarras + ", categoria="
				+ categoria + ", stock=" + stock + ", inventario=" + inventario + "]";
	}

	// Set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
