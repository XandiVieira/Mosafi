package com.relyon.mosafi.service;

import com.relyon.mosafi.model.Income;
import com.relyon.mosafi.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public void createIncome(Income income) {
        incomeRepository.save(income);
    }
}
