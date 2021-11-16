package com.pruebacrud.redlc.model;

import java.util.ArrayList;

import lombok.Data;
@Data
public class ServiceResult<T> {
	private T result;
	private Boolean isCorrect;
	private String menssageError;
	private Integer httpStatus;
	private ArrayList<String> warnings;

	public ServiceResult() {
		this.isCorrect = true;
	}

	public void setMenssageError(String menssageError) {
		this.isCorrect = false;
		this.menssageError = menssageError;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Integer getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}

	public ArrayList<String> getWarnings() {
		return warnings;
	}

	public void setWarnings(ArrayList<String> warnings) {
		this.warnings = warnings;
	}

	public String getMenssageError() {
		return menssageError;
	}
	

}
