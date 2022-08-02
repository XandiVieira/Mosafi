package com.relyon.mosafi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {

    public User(List<FinancialTransaction> financialTransactions) {
        this.financialTransactions = financialTransactions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<FinancialTransaction> financialTransactions;
}
