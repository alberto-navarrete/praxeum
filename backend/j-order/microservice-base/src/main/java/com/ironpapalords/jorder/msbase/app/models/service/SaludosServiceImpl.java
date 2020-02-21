package com.ironpapalords.jorder.msbase.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironpapalords.jorder.msbase.app.models.dao.ISaludoDao;
import com.ironpapalords.jorder.msbase.app.models.entity.Saludo;

@Service
public class SaludosServiceImpl implements ISaludosService {
	@Autowired
	private ISaludoDao saludoDao;

	@Override
	public Saludo saludar(String locale) {
		return saludoDao.findById(locale).orElse(null);
	}

	@Override
	public List<Saludo> saludos() {
		return (List<Saludo>) saludoDao.findAll();
	}

	@Override
	public Saludo agregarSaludo(Saludo saludo) {
		if (saludo == null) {
			return null;
		}

		return saludo = saludoDao.save(saludo);
	}

	@Override
	public Saludo actualizarSaludo(Saludo saludo) {
		return this.agregarSaludo(saludo);
	}

	@Override
	public void eliminarSaludo(String locale) {
		saludoDao.deleteById(locale);
	}

}
