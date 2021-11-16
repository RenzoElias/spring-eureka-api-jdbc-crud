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

import com.pruebacrud.redlc.dto.PaginationDTO;
import com.pruebacrud.redlc.dto.RequerimeintoDTO;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.service.SolicitudService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE })
@RequestMapping("api/requerimientos")
public class RequerimientoController {

	@Autowired
	private SolicitudService tramiteService;

	@PostMapping("crear-requerimientos")
	public ResponseEntity<ServiceResult<Solicitud>> crearSolicitud(@RequestBody RequerimeintoDTO nuevaSolicitud) {
		ServiceResult<Solicitud> response = tramiteService.crearSolicitud(nuevaSolicitud);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}
	
	@GetMapping("obtener-requerimientos")
	public ResponseEntity<ServiceResult<List<Solicitud>>> listaSolicitudes(Integer idSolicitud) { 
		ServiceResult<List<Solicitud>> response = tramiteService.obtenerSolicitudes( idSolicitud);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}

	@PostMapping("editar-requerimientos")
	public ResponseEntity<ServiceResult<Solicitud>> editarRequerimiento(@RequestBody RequerimeintoDTO tramite) {
		ServiceResult<Solicitud> response = tramiteService.editarRequerimiento(tramite);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}

	@DeleteMapping("borrar-requerimientos")
	public ResponseEntity<ServiceResult<Solicitud>> deleteRequerimiento(Integer idRequerimiento) {
		ServiceResult<Solicitud> response = tramiteService.eliminarRequerimiento(idRequerimiento);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getHttpStatus()));
	}
}