package com.pruebacrud.redlc.service;

import java.util.List;

import com.pruebacrud.redlc.dto.PaginationDTO;
import com.pruebacrud.redlc.dto.RequerimeintoDTO;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.model.Solicitud;

public interface SolicitudService {

	public ServiceResult<Solicitud> crearSolicitud(RequerimeintoDTO nuevaSolicitud);
	public ServiceResult<List<Solicitud>> obtenerSolicitudes(Integer idSolicitud );
	public ServiceResult<Solicitud> editarRequerimiento(RequerimeintoDTO requerimiento);
	public ServiceResult<Solicitud> eliminarRequerimiento(Integer idRequerimiento);
}
