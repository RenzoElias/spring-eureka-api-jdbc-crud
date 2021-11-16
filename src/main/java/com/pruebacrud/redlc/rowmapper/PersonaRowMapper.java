package com.pruebacrud.redlc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.model.Rol;

public class PersonaRowMapper implements RowMapper<Persona>{

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persona persona = new Persona();
		persona.setIdPersona(rs.getInt("id_persona"));
		persona.setNombres(rs.getString("nombres"));
		persona.setApePaterno(rs.getString("a_paterno"));
		persona.setApeMaterno(rs.getString("a_materno"));
		persona.setNombreArea(rs.getString("nombre_area"));
		
		Rol rol = new Rol();
		rol.setIdRol(rs.getInt("id_rol"));
		rol.setNombreRol(rs.getString("nombre_rol"));
		persona.setRol(rol);
		
		return persona;
	}

}
