package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

	@Id
	@GeneratedValue(generator = "seq_inve", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_inve", sequenceName = "seq_inve")
	@Column(name = "inve_id")
	private Integer id;

	@Column(name = "inve_cantidad")
	private Integer cantidad;

	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega bodega;

	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto producto;

	// To String
	@Override
	public String toString() {
		return "Inventario [id=" + id + ", cantidad=" + cantidad + ", bodega=" + bodega + ", producto=" + producto
				+ "]";
	}

	// Set Y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
