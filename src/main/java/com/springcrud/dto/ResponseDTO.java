package com.springcrud.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class ResponseDTO {
    public final Object data;
    public final String message;
    public final HttpStatus responseCode;
}
