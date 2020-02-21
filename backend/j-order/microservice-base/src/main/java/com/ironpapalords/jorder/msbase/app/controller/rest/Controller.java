package com.ironpapalords.jorder.msbase.app.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.jorder.msbase.app.models.entity.Saludo;
import com.ironpapalords.jorder.msbase.app.models.service.ISaludosService;

@RestController
@RequestMapping("/rest/")
@Validated
public class Controller {

	@Autowired
	private ISaludosService saludosService;

	@GetMapping
	public List<Saludo> saludar() {
		return saludosService.saludos();
	}

	@GetMapping("/{locale}")
	public Saludo saluer(@PathVariable String locale) {
		return saludosService.saludar(locale);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Saludo agregaSaludo(@Valid @RequestBody Saludo saludo) {
		return saludosService.agregarSaludo(saludo);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Saludo actualizaSaludo(@Valid @RequestBody Saludo saludo) {
		return saludosService.actualizarSaludo(saludo);
	}

	@DeleteMapping("/{locale}")
	public void eliminarSaludo(@PathVariable String locale) {
		saludosService.eliminarSaludo(locale);
	}
}