package com.pruebacrud.redlc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pruebacrud.redlc.model.Persona;
import com.pruebacrud.redlc.rowmapper.PersonaRowMapper;
@Repository
public class PersonaRepository{

	@Autowired
	JdbcTemplate requerimientosPg;
	
	public Persona obtenerPersona(Integer idPersona) {
		StringBuilder sql = new StringBuilder();
		Persona persona = null;
		sql.append(" Select p.id_persona,  ");
		sql.append(" p.nombres, p.a_paterno, ");
		sql.append(" p.a_materno, p.id_rol, ");
		sql.append(" r.nombre as nombre_rol, p.descripcion_rol as nombre_area");
		sql.append(" from requerimiento.persona p ");
		sql.append(" left join requerimiento.rol r on r.id_rol = p.id_rol ");
		sql.append(" where p.id_persona = ? ");
		System.out.println("SQL");
		try {
			
			Object[] params = new Object[] {idPersona};
			System.out.println("SQL");
			System.out.println(sql.toString());
			
			persona = requerimientosPg.query(sql.toString(),new PersonaRowMapper(), params).get(0);	
			System.out.println("RESPUESTA DE PERSONA");
			System.out.println(persona);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}
}
