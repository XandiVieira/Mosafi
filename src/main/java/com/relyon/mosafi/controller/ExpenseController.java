package com.relyon.mosafi.controller;

import com.relyon.mosafi.model.Expense;
import com.relyon.mosafi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public void createExpense(@RequestBody Expense expense){
        expenseService.createExpanse(expense);
    }

}
