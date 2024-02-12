package com.springcrud.controller;

import com.springcrud.dto.ResponseDTO;
import com.springcrud.dto.UserDTO;
import com.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/user")
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDTO> saveUsers(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }
}
