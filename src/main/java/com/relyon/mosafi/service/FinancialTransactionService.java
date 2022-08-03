package com.relyon.mosafi.service;

import com.relyon.mosafi.exception.ResourceNotFoundException;
import com.relyon.mosafi.model.FinancialTransaction;
import com.relyon.mosafi.repository.FinancialTransactionRepository;
import com.relyon.mosafi.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialTransactionService {

    @Autowired
    private FinancialTransactionRepository financialTransactionRepository;

    public ResponseEntity<Object> createExpanse(FinancialTransaction financialTransaction) {
        return new ResponseEntity<>(financialTransactionRepository.save(financialTransaction), HttpStatus.CREATED);
    }

    public ResponseEntity<List<FinancialTransaction>> getFinancialTransactionsByUserId() {
        long userId = 0;
        List<FinancialTransaction> financialTransactions = financialTransactionRepository.findByUserId(userId)
                .orElseThrow(() -> new ResourceNotFoundException("No transactions were found for You."));
        return new ResponseEntity<>(financialTransactions, HttpStatus.OK);
    }
}
