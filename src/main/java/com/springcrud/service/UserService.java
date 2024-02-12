package com.springcrud.service;

import com.springcrud.dto.ResponseDTO;
import com.springcrud.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO);
}
