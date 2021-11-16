package com.pruebacrud.redlc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.model.SolicitudTrazabilidad;

public class SolicitudRowMapper implements RowMapper<Solicitud>{

	@Override
	public Solicitud mapRow(ResultSet rs, int rowNum) throws SQLException {
		Solicitud solicitud = new Solicitud();
		solicitud.setIdSolicitud(rs.getInt("id_requerimiento"));
		solicitud.setFechaRegistro(rs.getString("fecha_registro"));
		solicitud.setDescripcion(rs.getString("descripcion_requerimiento"));
		
		
		Persona usuarioDestino = new Persona();
		usuarioDestino.setIdPersona(rs.getInt("id_usuario_solicitante"));
		usuarioDestino.setNombresCompletos(rs.getString("nombre_usuario_solicitante"));
		usuarioDestino.setNombreCargo(rs.getString("descripcion_rol_solicitante"));
		usuarioDestino.setNombreArea(rs.getString("descripcion_area_solicitante"));
		solicitud.setUsuarioDestino(usuarioDestino);
		
		Persona usuarioActual = new Persona();
		usuarioActual.setIdPersona(rs.getInt("id_usuario_actual"));
		usuarioActual.setNombresCompletos(rs.getString("nombre_usuario_actual"));
		usuarioActual.setNombreCargo(rs.getString("descripcion_rol_portador"));
		usuarioActual.setNombreArea(rs.getString("descripcion_area_portador"));
		solicitud.setUsuarioActual(usuarioActual);
		
//		solicitud.set
//		List<SolicitudTrazabilidad> listaTrazabilidad = new ArrayList<SolicitudTrazabilidad>();
//		solicitud.setListaTrazabilidad(listaTrazabilidad);

		Parametro id003AreaSolicitante = new Parametro();
//		id003AreaSolicitante.setIdParametro(rs.getInt("id_003_area_solicitante"));
//		id003AreaSolicitante.setNombre(rs.getString("nombre_area_solicitante"));
		solicitud.setId003AreaSolicitante(id003AreaSolicitante);
		
		Parametro id004EstadoSolicitud = new Parametro();
//		id004EstadoSolicitud.setIdParametro(rs.getInt("id_004_estado_solicitud"));
//		id004EstadoSolicitud.setNombre(rs.getString("nombre_estado"));
		solicitud.setId004EstadoSolicitud(id004EstadoSolicitud);
		
		Parametro id005TipoRequerimiento = new Parametro();
		id005TipoRequerimiento.setIdParametro(rs.getInt("id_003_tipo_requerimiento"));
		id005TipoRequerimiento.setNombre(rs.getString("nombre_tipo_requerimiento"));
		solicitud.setId005TipoSolicitud(id005TipoRequerimiento);
		
		return solicitud;
	}

}
