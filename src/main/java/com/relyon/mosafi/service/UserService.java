package com.relyon.mosafi.service;

import com.relyon.mosafi.model.User;
import com.relyon.mosafi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }
}
