package com.marcelodev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException{

	public ModeloNotFoundException(String message) {
		super(message);
	}

}
