package com.relyon.mosafi.controller;

import com.relyon.mosafi.model.FinancialTransaction;
import com.relyon.mosafi.service.FinancialTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/financial-transactions")
public class FinancialTransactionController {

    @Autowired
    private FinancialTransactionService financialTransactionService;

    @PostMapping
    public void createExpense(@RequestBody FinancialTransaction financialTransaction) {
        financialTransactionService.createExpanse(financialTransaction);
    }

}
