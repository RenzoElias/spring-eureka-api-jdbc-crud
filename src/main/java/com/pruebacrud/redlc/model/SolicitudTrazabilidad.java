package com.pruebacrud.redlc.model;

import lombok.Data;

@Data
public class SolicitudTrazabilidad {

	private Integer idTrazabilidad;
	private Integer idSolicitud;
	private String fechaRegistro;
	private String observacion;
	private Parametro id004EstadoSolicitud;
	private Integer idUsuario;
	private Persona persona;
	public Integer getIdTrazabilidad() {
		return idTrazabilidad;
	}
	public void setIdTrazabilidad(Integer idTrazabilidad) {
		this.idTrazabilidad = idTrazabilidad;
	}
	public Integer getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Parametro getId004EstadoSolicitud() {
		return id004EstadoSolicitud;
	}
	public void setId004EstadoSolicitud(Parametro id004EstadoSolicitud) {
		this.id004EstadoSolicitud = id004EstadoSolicitud;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
}
