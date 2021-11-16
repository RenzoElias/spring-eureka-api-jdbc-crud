package com.pruebacrud.redlc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pruebacrud.redlc.model.Parametro;
import com.pruebacrud.redlc.model.ServiceResult;
import com.pruebacrud.redlc.model.Solicitud;
import com.pruebacrud.redlc.repository.ParametroRepository;

@Service
public class ParametroServiceImplement implements ParametroService{

	@Autowired
	private ParametroRepository parametroRepository;
	
	@Override
	public ServiceResult<List<Parametro>> listOfParametro(Integer idParametrosTipo) {
		ServiceResult<List<Parametro>> response = new ServiceResult<List<Parametro>>();
		try {
			List<Parametro> listOfOrders = parametroRepository.getParamsType(idParametrosTipo);
			response.setResult(listOfOrders);
			response.setHttpStatus(HttpStatus.OK.value());
		}catch (Exception e) {
			response.setHttpStatus(HttpStatus.BAD_REQUEST.value());
			response.setMenssageError(e.getMessage());
		}
		return response;
	}

}
