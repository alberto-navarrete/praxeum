package com.ironpapalords.jorder.ank.app.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.jorder.ank.app.models.entity.Usuario;
import com.ironpapalords.jorder.ank.app.models.service.UsuarioService;

@RestController
@RequestMapping("/rest/")
@Validated
public class Controller {

	@Autowired
	private UsuarioService saludosService;

	@GetMapping
	public List<Usuario> saludar() {
		return saludosService.usuarios();
	}

	@GetMapping("/{usuario}")
	public Usuario usuario(@PathVariable String usuario) {
		return saludosService.obtenerUsuario(usuario);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario agregaUsuario(@Valid @RequestBody Usuario usuario) {
		return saludosService.agregarUsuario(usuario);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario actualizaSaludo(@Valid @RequestBody Usuario usuario) {
		return saludosService.actualizarUsuario(usuario);
	}

}