package com.pruebacrud.redlc.model;

import java.util.List;

import lombok.Data;

@Data
public class Solicitud {

	private Integer idSolicitud;
	private String fechaRegistro;
	private Persona usuarioActual;
	private Persona usuarioDestino;
	private String descripcion;
	private Parametro id003AreaSolicitante;
	private Parametro id004EstadoSolicitud;
	private Parametro id005TipoSolicitud;
	private List<SolicitudTrazabilidad> listaTrazabilidad;
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
	public Persona getUsuarioActual() {
		return usuarioActual;
	}
	public void setUsuarioActual(Persona usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	public Persona getUsuarioDestino() {
		return usuarioDestino;
	}
	public void setUsuarioDestino(Persona usuarioDestino) {
		this.usuarioDestino = usuarioDestino;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Parametro getId003AreaSolicitante() {
		return id003AreaSolicitante;
	}
	public void setId003AreaSolicitante(Parametro id003AreaSolicitante) {
		this.id003AreaSolicitante = id003AreaSolicitante;
	}
	public Parametro getId004EstadoSolicitud() {
		return id004EstadoSolicitud;
	}
	public void setId004EstadoSolicitud(Parametro id004EstadoSolicitud) {
		this.id004EstadoSolicitud = id004EstadoSolicitud;
	}
	public Parametro getId005TipoSolicitud() {
		return id005TipoSolicitud;
	}
	public void setId005TipoSolicitud(Parametro id005TipoSolicitud) {
		this.id005TipoSolicitud = id005TipoSolicitud;
	}
	public List<SolicitudTrazabilidad> getListaTrazabilidad() {
		return listaTrazabilidad;
	}
	public void setListaTrazabilidad(List<SolicitudTrazabilidad> listaTrazabilidad) {
		this.listaTrazabilidad = listaTrazabilidad;
	}
	
	
	
}
