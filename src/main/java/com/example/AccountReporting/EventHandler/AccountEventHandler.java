package com.example.AccountReporting.EventHandler;

import com.example.EventSourcing.events.AccountCreatedEvent;
import com.example.AccountReporting.repository.AccountReportRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class AccountEventHandler {
    private final AccountReportRepository accountReportRepository;

    public AccountEventHandler(AccountReportRepository accountReportRepository) {
        this.accountReportRepository = accountReportRepository;
    }

    @EventHandler
    public void accountCreatedHandler(AccountCreatedEvent accountCreatedEvent){
        System.out.println(accountCreatedEvent);
        accountReportRepository.incrementNumberOfCreatedAccounts(1);
    }
}
