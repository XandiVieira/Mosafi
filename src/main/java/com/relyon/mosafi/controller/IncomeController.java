package com.relyon.mosafi.controller;

import com.relyon.mosafi.model.Income;
import com.relyon.mosafi.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/incomes")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @PostMapping
    public void createIncome(@RequestBody Income income) {
        incomeService.createIncome(income);
    }
}
