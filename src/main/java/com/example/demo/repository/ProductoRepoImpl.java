package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscarPorNumero(String codBarras) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT e FROM Producto e WHERE " + " e.codigoBarras = :datoCodigo", Producto.class);
		query.setParameter("datoCodigo", codBarras);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public Integer actualizarStock(Integer cantidad, String codBarras) {
		// TODO Auto-generated method stub
		Query query = this.entityManager
				.createQuery("UPDATE e.stock SET e.stock= :datoCantidad FROM  WHERE e.codigoBarras= :datoCodigo");
		query.setParameter("datoCantidad", cantidad);
		query.setParameter("datoCodigo", codBarras);
		return query.executeUpdate();
	}

}
