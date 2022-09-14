package com.generation.deme.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.generation.deme.repositories.UsuarioRepositorio;
import com.generation.deme.models.UsuarioModels;
import java.util.ArrayList;

@Service
public class UsuarioServices {
	@Autowired // 
	
	UsuarioRepositorio usuarioRepositorio;
	
	public ArrayList<UsuarioModels> obtenerUsuario(){
		
		return (ArrayList<UsuarioModels>)usuarioRepositorio.findAll();
	}
	
	public UsuarioModels guardarUsuario(UsuarioModels usuario){
        return usuarioRepositorio.save(usuario);
    }

}

