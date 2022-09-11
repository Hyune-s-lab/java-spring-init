package com.example.javaspringinit.api.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.UUID;

public record AccountWithdrawRequest(
        @NotNull UUID accountId,
        @Positive BigDecimal amount
) {

}
