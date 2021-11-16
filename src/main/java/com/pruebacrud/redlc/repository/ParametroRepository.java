package com.pruebacrud.redlc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.Persona;
@Repository
public class ParametroRepository{
	@Autowired
	JdbcTemplate requerimientosPg;
	
	public List<Parametro> getParamsType(Integer idParamType) {
		StringBuilder sql = new StringBuilder();
		sql.append(" Select id_parametro as idParametro , id_parametro_tipo as ididParametroTipe, nombre ");
		sql.append(" from requerimiento.parametro ");
		sql.append(" where id_parametro_tipo = ? "); 
		try {
			Object[] params = new Object[] {idParamType};
			List<Parametro> catalogo = 
					requerimientosPg.query(sql.toString(), BeanPropertyRowMapper.newInstance(Parametro.class), params);			
			catalogo.forEach(System.out :: println);
			return catalogo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
