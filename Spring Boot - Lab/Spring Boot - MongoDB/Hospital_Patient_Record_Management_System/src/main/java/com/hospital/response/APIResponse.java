package com.hospital.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponse<T> {

	private int statusCode;
	private String status;
	private String message;
	private T data;
}
