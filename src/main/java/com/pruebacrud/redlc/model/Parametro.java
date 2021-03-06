package com.pruebacrud.redlc.model;

import lombok.Data;

@Data 
public class Parametro {

	private Integer idParametro; //id_parametro
	private Integer idParametroTipo; //id_parametro_tipo
	private String nombre; //nombre
	public Integer getIdParametro() {
		return idParametro;
	}
	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}
	public Integer getIdParametroTipo() {
		return idParametroTipo;
	}
	public void setIdParametroTipo(Integer idParametroTipo) {
		this.idParametroTipo = idParametroTipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
