package com.pruebacrud.redlc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebacrud.redlc.dto.PaginationDTO;
import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.service.PersonaService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@RequestMapping("api/requerimientos")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping("obtener-persona")
	public ResponseEntity<ServiceResult<Persona>> obtenerPersona(Integer idPersona) {
		System.out.println("controller");
//		HttpStatus status = HttpStatus.OK;
		ServiceResult<Persona> response = personaService.obtenerPersona(idPersona);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}
	
}