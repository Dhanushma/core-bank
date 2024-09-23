package com.coral.bank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name="Transaction Response",
        description = "Response structure of Transaction"
)
public class TransactionResponseDTO {
    @Schema(
            description = "List containing transactions"
    )
    private List<TransactionDTO> transactionDTOList;
    @Schema(
            description = "Last page indicator"
    )
    boolean isLastPage;
}
