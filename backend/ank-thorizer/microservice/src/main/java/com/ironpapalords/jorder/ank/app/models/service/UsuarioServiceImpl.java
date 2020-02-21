package com.ironpapalords.jorder.ank.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironpapalords.jorder.ank.app.models.dao.UsuariosDAO;
import com.ironpapalords.jorder.ank.app.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuariosDAO usuariosDAO;

	@Override
	public Usuario obtenerUsuario(String correo) {
		return usuariosDAO.findById(correo).orElse(null);
	}

	@Override
	public List<Usuario> usuarios() {
		return (List<Usuario>) usuariosDAO.findAll();
	}
	
	@Override
	public Usuario agregarUsuario(Usuario usuario) {
		if (usuario == null) {
			return null;
		}
		return usuario = usuariosDAO.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return this.agregarUsuario(usuario);
	}

}
