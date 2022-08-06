package com.relyon.mosafi.controller.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserDto {

    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 6, max = 30)
    private String password;
}