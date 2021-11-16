package com.pruebacrud.redlc.model;

import lombok.Data;

@Data
public class Rol {

	private Integer idRol;
	private String nombreRol;
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
}
