package com.cvmendes.cursospring.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cvmendes.cursospring.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		String message = e.getMessage();
		Integer status = HttpStatus.NOT_FOUND.value();
		StandardError err = new StandardError(status, message, System.currentTimeMillis());
		return ResponseEntity.status(status).body(err);
	}
	
}