package com.ironpapalords.jorder.msbase.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ironpapalords.jorder.msbase.app.models.entity.Saludo;

public interface ISaludoDao extends CrudRepository<Saludo, String> {

}