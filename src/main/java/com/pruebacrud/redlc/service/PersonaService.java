package com.pruebacrud.redlc.service;

import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.model.ServiceResult;

public interface PersonaService {
	public ServiceResult<Persona> obtenerPersona(Integer idPersona);
}
