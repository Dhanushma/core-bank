package com.coral.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponseDTO {
    private List<TransactionDTO> transactionDTOList;
    boolean isLastPage;
}
