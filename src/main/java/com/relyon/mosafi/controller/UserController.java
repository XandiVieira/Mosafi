package com.relyon.mosafi.controller;

import com.relyon.mosafi.controller.dto.request.UserDto;
import com.relyon.mosafi.service.UserService;
import com.relyon.mosafi.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EntityConverter entityConverter;

    @PostMapping
    public void createUser(@RequestBody UserDto userDto) {
        userService.createUser(entityConverter.convertUserDtoToEntity(userDto));
    }
}
