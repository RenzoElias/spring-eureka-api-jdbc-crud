package com.pruebacrud.redlc.model;

import lombok.Data;

@Data  
public class Persona {
	
	private Integer idPersona; //id_persona
	private String nombres; //nombres
	private String apePaterno; //a_paterno
	private String apeMaterno; //a_materno
	private String nombresCompletos; // CONCAT
	private String nombreCargo; //descripcion_rol
	private String nombreArea; //descripcion_area
	
	private Rol rol;
	private Parametro id002Cargo; //id_rol
	private Parametro id003Area;
	private Parametro id001Estado;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getNombresCompletos() {
		return nombresCompletos;
	}
	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}
	public String getNombreCargo() {
		return nombreCargo;
	}
	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}
	public String getNombreArea() {
		return nombreArea;
	}
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Parametro getId002Cargo() {
		return id002Cargo;
	}
	public void setId002Cargo(Parametro id002Cargo) {
		this.id002Cargo = id002Cargo;
	}
	public Parametro getId003Area() {
		return id003Area;
	}
	public void setId003Area(Parametro id003Area) {
		this.id003Area = id003Area;
	}
	public Parametro getId001Estado() {
		return id001Estado;
	}
	public void setId001Estado(Parametro id001Estado) {
		this.id001Estado = id001Estado;
	}
	
	
	
}
