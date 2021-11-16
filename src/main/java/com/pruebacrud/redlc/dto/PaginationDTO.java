package com.pruebacrud.redlc.dto;

import java.util.List;

import lombok.Data;

@Data
public class PaginationDTO<T> {

	private T content;
	private Integer totalElements;
	private Integer totalPages;
	private Integer number;
	private Integer numberOfElements;
	
}
