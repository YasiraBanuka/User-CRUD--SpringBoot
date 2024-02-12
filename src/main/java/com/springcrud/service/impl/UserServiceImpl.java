package com.springcrud.service.impl;

import com.springcrud.dto.ResponseDTO;
import com.springcrud.dto.UserDTO;
import com.springcrud.entity.User;
import com.springcrud.repository.UserRepository;
import com.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        userRepository.save(user);
        return new ResponseEntity<>(ResponseDTO.builder()
                .message("Save User Successfully")
                .responseCode(HttpStatus.CREATED)
                .build(), HttpStatus.CREATED
        );
    }
}
