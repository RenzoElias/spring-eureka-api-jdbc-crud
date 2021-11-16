package com.pruebacrud.redlc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pruebacrud.redlc.dto.PaginationDTO;
import com.pruebacrud.redlc.dto.RequerimeintoDTO;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.repository.SolicitudRepository;

@Service
public class SolicitudServiceImplement implements SolicitudService{

	@Autowired
	private SolicitudRepository solicitudRepository;

	@Override
	public ServiceResult<List<Solicitud>> obtenerSolicitudes(Integer idSolicitud) {
		ServiceResult<List<Solicitud>> response = new ServiceResult<List<Solicitud>>();
		try {
			response.setResult(solicitudRepository.obtenerSolicitudes(idSolicitud));
			response.setHttpStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			response.setHttpStatus(HttpStatus.BAD_REQUEST.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}


	@Override
	public ServiceResult<Solicitud> crearSolicitud(RequerimeintoDTO nuevaSolicitud) {
		ServiceResult<Solicitud> response = new ServiceResult<Solicitud>();
		try { 
			solicitudRepository.crearSolicitud(nuevaSolicitud);
			response.setResult(null);
			response.setHttpStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			e.printStackTrace();
			response.setHttpStatus(HttpStatus.BAD_REQUEST.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}

	/*
	 * Type action edit = 1 add = 2 status = 3
	 */
	@Override
	public ServiceResult<Solicitud> editarRequerimiento(RequerimeintoDTO requerimiento) {
		ServiceResult<Solicitud> response = new ServiceResult<Solicitud>();
		try {
			solicitudRepository.editarRequerimiento(1);
			response.setResult(null);
			response.setHttpStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			response.setHttpStatus(HttpStatus.OK.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}

	@Override
	public ServiceResult<Solicitud> eliminarRequerimiento(Integer idRequerimiento) {
		ServiceResult<Solicitud> response = new ServiceResult<Solicitud>();
		try {
			solicitudRepository.eliminarRequerimiento(idRequerimiento);
			response.setHttpStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			response.setHttpStatus(HttpStatus.OK.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}

}
