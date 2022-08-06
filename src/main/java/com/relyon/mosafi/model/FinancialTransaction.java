package com.relyon.mosafi.model;

import com.relyon.mosafi.model.enums.FinancialTransactionType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "financial_transactions")
public class FinancialTransaction {

    public FinancialTransaction(FinancialTransactionType type, BigDecimal value, LocalDateTime date, Category category, User user) {
        this.type = type;
        this.value = value;
        this.date = date;
        this.category = category;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FinancialTransactionType type;

    private BigDecimal value;

    private LocalDateTime date;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}