package com.relyon.mosafi.repository;

import com.relyon.mosafi.model.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FinancialTransactionRepository extends JpaRepository<FinancialTransaction, Long> {
    Optional<List<FinancialTransaction>> findByUserId(long userId);
}