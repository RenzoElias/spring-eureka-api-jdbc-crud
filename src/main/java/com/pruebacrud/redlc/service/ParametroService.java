package com.pruebacrud.redlc.service;

import java.util.List;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.ServiceResult;

public interface ParametroService {

	public ServiceResult<List<Parametro>> listOfParametro(Integer idParametrosTipo);
	
}
