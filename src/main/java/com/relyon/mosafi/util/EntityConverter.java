package com.relyon.mosafi.util;

import com.relyon.mosafi.controller.dto.request.FinancialTransactionDto;
import com.relyon.mosafi.controller.dto.request.UserDto;
import com.relyon.mosafi.model.FinancialTransaction;
import com.relyon.mosafi.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityConverter {

    @Autowired
    private ModelMapper modelMapper;

    public FinancialTransaction convertDinancialTransactionDtoToEntity(FinancialTransactionDto financialTransactionDto) {
        return modelMapper.map(financialTransactionDto, FinancialTransaction.class);
    }

    public User convertUserDtoToEntity(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }
}
