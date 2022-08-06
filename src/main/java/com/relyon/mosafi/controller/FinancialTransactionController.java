package com.relyon.mosafi.controller;

import com.relyon.mosafi.controller.dto.request.FinancialTransactionDto;
import com.relyon.mosafi.service.FinancialTransactionService;
import com.relyon.mosafi.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/financial-transactions")
public class FinancialTransactionController {

    @Autowired
    private FinancialTransactionService financialTransactionService;

    @Autowired
    private EntityConverter entityConverter;

    @PostMapping
    public ResponseEntity<Object> createExpense(@RequestBody @Valid FinancialTransactionDto financialTransactionDto) {
        return financialTransactionService.createExpanse(entityConverter.convertFinancialTransactionDtoToEntity(financialTransactionDto));
    }
}