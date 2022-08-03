package com.relyon.mosafi.controller.dto.request;

import com.relyon.mosafi.model.enums.FinancialTransactionType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class FinancialTransactionDto {

    @NotBlank
    @Enumerated
    private FinancialTransactionType type;

    @NotBlank
    private BigDecimal value;

    @NotBlank
    private String category;
}