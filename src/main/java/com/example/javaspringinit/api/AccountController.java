package com.example.javaspringinit.api;

import com.example.javaspringinit.api.request.AccountDepositRequest;
import com.example.javaspringinit.api.request.AccountWithdrawRequest;
import com.example.javaspringinit.api.response.AccountDepositResponse;
import com.example.javaspringinit.api.response.AccountWithdrawResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@Tag(name = "계좌")
@RestController
public class AccountController {

    @Operation(summary = "계좌 생성")
    @PostMapping("/account")
    public UUID create() {
        return UUID.randomUUID();
    }

    @Operation(summary = "계좌 입금")
    @PostMapping("/account/deposit")
    public AccountDepositResponse deposit(@Validated @RequestBody AccountDepositRequest request) {
        log.info("### request: accountId={}, amount={}", request.accountId(), request.amount());
        return new AccountDepositResponse(request.accountId(), request.amount());
    }

    @Operation(summary = "계좌 출금")
    @PostMapping("/account/withdraw")
    public AccountWithdrawResponse withdraw(@Validated @RequestBody AccountWithdrawRequest request) {
        log.info("### request: accountId={}, amount={}", request.accountId(), request.amount());
        return new AccountWithdrawResponse(request.accountId(), request.amount());
    }
}
