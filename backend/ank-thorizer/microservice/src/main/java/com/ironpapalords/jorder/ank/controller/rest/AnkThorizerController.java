package com.ironpapalords.jorder.ank.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.jorder.ank.models.entity.Usuario;
import com.ironpapalords.jorder.ank.models.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class AnkThorizerController {

	@Autowired
	private UsuarioService usuariosService;

	@GetMapping
	public List<Usuario> saludar() {
		return usuariosService.usuarios();
	}

	@GetMapping("/{usuario}")
	public ResponseEntity<Usuario> usuario(@PathVariable String usuario) {
		
        Usuario usuarioEntity = usuariosService.obtenerUsuario(usuario);
        
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(usuarioEntity);
        }
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario agregaUsuario(@Valid @RequestBody Usuario usuario) {
		return usuariosService.agregarUsuario(usuario);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario actualizaSaludo(@Valid @RequestBody Usuario usuario) {
		return usuariosService.actualizarUsuario(usuario);
	}

}