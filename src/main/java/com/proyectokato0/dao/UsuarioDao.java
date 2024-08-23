package com.proyectokato0.dao;

import java.util.List;

import com.proyectokato0.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}
