package com.proyectokato0.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectokato0.dao.UsuarioDao;
import com.proyectokato0.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@RequestMapping(value = "usuarios")
	public Usuario listarUsuarios() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Katia");
		usuario.setApellido("Ortega");
		usuario.setEmail("ortegakatia@gmail.com");
		usuario.setTelefono("2347478");

		return usuario;
	}

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuarios(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Katia");
		usuario.setApellido("Ortega");
		usuario.setEmail("ortegakatia@gmail.com");
		usuario.setTelefono("2347478");

		return usuario;
	}

	@RequestMapping(value = "usuario/listar_user")
	public List<Usuario> listar_variosUsuarios() {

		List<Usuario> usuarios = new ArrayList<>();

		Usuario usuario1 = new Usuario();
		usuario1.setId(2L);
		usuario1.setNombre("Katia");
		usuario1.setApellido("Ortega");
		usuario1.setEmail("ortegakatia@gmail.com");
		usuario1.setTelefono("2347478");

		Usuario usuario2 = new Usuario();
		usuario2.setId(3L);
		usuario2.setNombre("Mariana");
		usuario2.setApellido("Molina");
		usuario2.setEmail("molinamariana@gmail.com");
		usuario2.setTelefono("244663378");

		Usuario usuario3 = new Usuario();
		usuario3.setId(4L);
		usuario3.setNombre("Daniel");
		usuario3.setApellido("Mortaro");
		usuario3.setEmail("mortarodaniel@gmail.com");
		usuario3.setTelefono("234747593");

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuarios(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		return user;
	}

}
