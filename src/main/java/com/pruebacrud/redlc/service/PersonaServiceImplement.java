package com.pruebacrud.redlc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pruebacrud.redlc.dto.PaginationDTO;
import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.repository.PersonaRepository;
import com.pruebacrud.redlc.repository.SolicitudRepository;
@Service
public class PersonaServiceImplement implements PersonaService{

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public ServiceResult<Persona> obtenerPersona(Integer idPersona) {
		ServiceResult<Persona> response = new ServiceResult<Persona>();
		try {
			System.out.println("obtenerPersona");
			Persona persona = personaRepository.obtenerPersona(idPersona);
			response.setResult(persona);
			response.setHttpStatus(HttpStatus.OK.value());
		}catch (Exception e) {
			response.setHttpStatus(HttpStatus.BAD_REQUEST.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}

}
