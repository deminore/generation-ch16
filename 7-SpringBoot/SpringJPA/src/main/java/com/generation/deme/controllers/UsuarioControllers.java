package com.generation.deme.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.generation.deme.models.UsuarioModels;
import com.generation.deme.services.UsuarioServices;

@RestController
@RequestMapping
public class UsuarioControllers {
	@Autowired
	UsuarioServices usuarioServices;
	
	@GetMapping()
	public ArrayList<UsuarioModels> obtenerUsuario(){
        return usuarioServices.obtenerUsuario();
    }
	
	@PostMapping()
	public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuario){
	        return this.usuarioServices.guardarUsuario(usuario);
	    }

	

}
