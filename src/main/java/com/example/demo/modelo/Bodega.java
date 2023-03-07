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
@Table(name = "bodega")
public class Bodega {

	@Id
	@GeneratedValue(generator = "seq_bode", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_bode", sequenceName = "seq_bode")
	@Column(name = "bode_id")
	private Integer id;

	@Column(name = "bode_nombre")
	private String nombre;

	@Column(name = "bode_numero")
	private String numero;

	@Column(name = "bode_direccion")
	private String direccion;

	@Column(name = "bode_telefono")
	private String telefono;

	@OneToMany(mappedBy = "bodega")
	private List<Inventario> inventario;

	// To String
	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}

	// SET Y GET
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

}
