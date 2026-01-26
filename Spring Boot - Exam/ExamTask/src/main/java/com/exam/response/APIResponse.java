package com.exam.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponse<T> {
	
	private int statusCode;
	private String Status;
	private String message;
	private T data;
}
