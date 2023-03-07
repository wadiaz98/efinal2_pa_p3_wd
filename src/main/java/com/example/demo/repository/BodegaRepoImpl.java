package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public Bodega buscarBodega(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Bodega> query = this.entityManager
				.createQuery("SELECT e FROM Bodega e WHERE" + " e.numero= :datonumero", Bodega.class);
		query.setParameter("datoNumero", numero);
		return null;
	}

}
