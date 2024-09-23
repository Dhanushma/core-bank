package com.coral.bank.service;


import com.coral.bank.dto.TransactionResponseDTO;

import java.time.LocalDate;

public interface TransactionService {

    TransactionResponseDTO getTransactionsByAccountNumberAndDateRange(
            String accountNumber, LocalDate fromDate, LocalDate toDate, int page, int size);
}
