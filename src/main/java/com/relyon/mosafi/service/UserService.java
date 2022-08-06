package com.relyon.mosafi.service;

import com.relyon.mosafi.model.User;
import com.relyon.mosafi.repository.UserRepository;
import com.relyon.mosafi.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityConverter entityConverter;

    public ResponseEntity<Object> createUser(User user) {
        return new ResponseEntity<>(entityConverter.convertUserEntityToResponse(userRepository.save(user)), HttpStatus.CREATED);
    }
}