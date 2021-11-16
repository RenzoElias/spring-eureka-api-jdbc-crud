package com.pruebacrud.redlc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pruebacrud.redlc.dto.RequerimeintoDTO;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.rowmapper.SolicitudRowMapper;
import com.pruebacrud.redlc.util.Constantes;
@Repository
public class SolicitudRepository {

	@Autowired
	JdbcTemplate requerimientosPg;
	
	public List<Solicitud> obtenerSolicitudes(Integer idSolicitud){
		StringBuilder sql = new StringBuilder();
		List<Solicitud> solicitud = null;
		sql.append(" select r.id_requerimiento, r.fecha_registro, ");
		sql.append(" r.descripcion_requerimiento, r.id_003_tipo_requerimiento,");
		sql.append(" r.id_usuario_solicitante, r.id_usuario_actual,  ");
		sql.append(" CONCAT (solicitante.nombres, ' ', solicitante.a_paterno, ' ', solicitante.a_materno) as nombre_usuario_solicitante, ");
		sql.append(" solicitante.descripcion_rol as descripcion_rol_solicitante, solicitante.descripcion_area as  descripcion_area_solicitante, ");
		sql.append(" CONCAT (portador.nombres, ' ', portador.a_paterno, ' ', portador.a_materno) as nombre_usuario_actual, ");
		sql.append(" portador.descripcion_rol as descripcion_rol_portador , portador.descripcion_area as descripcion_area_portador, ");
		sql.append(" tipo.nombre as nombre_tipo_requerimiento ");
		sql.append(" from requerimiento.requerimiento r ");
		sql.append(" left join requerimiento.persona solicitante on solicitante.id_persona = r.id_usuario_solicitante");
		sql.append(" left join requerimiento.persona portador on portador.id_persona = r.id_usuario_actual");
		sql.append(" left join requerimiento.parametro tipo on tipo.id_parametro = r.id_003_tipo_requerimiento");
		sql.append(" where 1=1 ");
		if(idSolicitud!=null)sql.append(" and id_requerimiento = "+idSolicitud);
		sql.append(" order by id_requerimiento desc");
		try {
//			Object[] params = new Object[] {idSolicitud};
			solicitud = 
					requerimientosPg.query(sql.toString(),new SolicitudRowMapper());		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return solicitud;
	}
	
	public void crearSolicitud(RequerimeintoDTO objeto){
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into requerimiento.requerimiento ");
		sql.append(" ( descripcion_requerimiento, id_003_tipo_requerimiento,  ");
		sql.append(" id_usuario_solicitante, id_usuario_actual, fecha_registro) ");
		sql.append(" values ");
		sql.append(" ( ?, ?, ?, ?, current_date) ");
		
		Object[] params = new Object[] {};
//				objeto.getDescripcion(), objeto.getId003TipoSolicitud(),
//				objeto.getIdUsuarioSolicitante(), Constantes.USUARIO_COORDINADOR_HELPDESK};
		requerimientosPg.update(sql.toString(), params);
	}
	public void editarRequerimiento(Integer idRequerimiento) {
		StringBuilder sql = new StringBuilder();
		sql.append("update requerimiento.requerimiento ");
		sql.append("set id_ ");
		sql.append(" WHERE id_requerimiento = ? ");
		Object[] params = new Object[] {idRequerimiento};
		requerimientosPg.update(sql.toString(), params);
	}
	public void eliminarRequerimiento(Integer idRequerimiento) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM requerimiento.requerimiento ");
		
		sql.append(" WHERE id_requerimiento = ? ");
		Object[] params = new Object[] {idRequerimiento};
		requerimientosPg.update(sql.toString(), params);
	}
	
}
