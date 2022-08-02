package com.relyon.mosafi.service;

import com.relyon.mosafi.model.FinancialTransaction;
import com.relyon.mosafi.repository.FinancialTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialTransactionService {

    @Autowired
    private FinancialTransactionRepository financialTransactionRepository;

    public void createExpanse(FinancialTransaction financialTransaction) {
        financialTransactionRepository.save(financialTransaction);
    }
}
