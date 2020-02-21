package com.ironpapalords.jorder.ank.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ironpapalords.jorder.ank.app.models.entity.Usuario;

public interface UsuariosDAO extends CrudRepository<Usuario, String> {

}