package com.example.javaspringinit.api.response;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.UUID;

public record AccountDepositResponse(
        @NotNull UUID accountId,
        @Positive BigDecimal amount
) {

}
