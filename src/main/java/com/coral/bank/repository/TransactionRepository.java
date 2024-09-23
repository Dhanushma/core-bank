package com.coral.bank.repository;

import com.coral.bank.entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("select t from Transaction t where t.accountNumber= :accountNumber and t.transactionDate between :fromDate and :toDate")
    Page<Transaction> findTransactionsByAccountAndDateRange(
            @Param("accountNumber") String accountNumber,
            @Param("fromDate") LocalDate fromDate,
            @Param("toDate") LocalDate toDate,
            Pageable pageable);
}
