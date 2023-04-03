package com.example.AccountReporting.Controller;

import com.example.AccountReporting.repository.AccountReportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountReportRepository accountReportRepository;

    public AccountController(AccountReportRepository accountReportRepository) {
        this.accountReportRepository = accountReportRepository;
    }
    @GetMapping("/count")
    public int gettingTotalAccountCount(){

        return accountReportRepository.getAccountCount();
    }
}
