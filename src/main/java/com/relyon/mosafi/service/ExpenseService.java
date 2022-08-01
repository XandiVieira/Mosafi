package com.relyon.mosafi.service;

import com.relyon.mosafi.model.Expense;
import com.relyon.mosafi.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public void createExpanse(Expense expense) {
        expenseRepository.save(expense);
    }
}
