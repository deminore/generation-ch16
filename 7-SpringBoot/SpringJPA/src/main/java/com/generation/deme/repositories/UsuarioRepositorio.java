package com.generation.deme.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.deme.models.UsuarioModels;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModels, Long> {
	
	public abstract ArrayList<UsuarioModels> findByPrioridad(Integer prioridad);
}
