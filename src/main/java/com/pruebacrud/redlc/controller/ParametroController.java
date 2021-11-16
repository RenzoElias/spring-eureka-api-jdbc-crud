package com.pruebacrud.redlc.controller;

import java.util.List;

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

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.service.ParametroService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@RequestMapping("api/requerimiento")
public class ParametroController {

	@Autowired
	private ParametroService parametroService;
	
	@GetMapping("obtener-parametros")
	public ResponseEntity<Object> listOfParametro(Integer idParametrosTipo) {
		ServiceResult<List<Parametro>> response = parametroService.listOfParametro(idParametrosTipo);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}

}
