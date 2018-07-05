package com.prueba.empresa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No hay socio Disponible")
public class ExceptionSocio extends RuntimeException{

	private static final long serialVersionUID = 01L;

}
