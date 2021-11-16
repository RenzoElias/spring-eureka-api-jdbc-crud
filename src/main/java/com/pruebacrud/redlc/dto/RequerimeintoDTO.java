package com.pruebacrud.redlc.dto;

import java.util.List;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.SolicitudTrazabilidad;

import lombok.Data;

@Data
public class RequerimeintoDTO {

	private Integer idSolicitud;
	private String fechaRegistro;
	
	private String descripcion;
	private Integer idUsuarioSolicitante;
	
	private Integer id003TipoSolicitud;

}
