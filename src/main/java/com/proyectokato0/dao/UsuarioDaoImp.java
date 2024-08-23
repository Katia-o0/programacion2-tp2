package com.proyectokato0.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyectokato0.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.persistence.PersistenceContext;


@Repository
public class UsuarioDaoImp implements UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Usuario> obtenerUsuarios() {
		String query = "from Usuario";
		List<Usuario> resultado = entityManager.createQuery(query).getResultList();

		return resultado;
	}

}
