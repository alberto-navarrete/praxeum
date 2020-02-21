package com.ironpapalords.jorder.ank.app.models.service;

import java.util.List;

import com.ironpapalords.jorder.ank.app.models.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> usuarios();

	public Usuario obtenerUsuario(String correo);

	public Usuario agregarUsuario(Usuario usuario);

	public Usuario actualizarUsuario(Usuario usuario);

}