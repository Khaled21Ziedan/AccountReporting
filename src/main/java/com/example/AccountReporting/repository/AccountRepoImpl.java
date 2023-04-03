package com.example.AccountReporting.repository;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;
@Component
public class AccountRepoImpl implements AccountReportRepository{
    AtomicInteger count = new AtomicInteger();
    @Override
    public void incrementNumberOfCreatedAccounts(int delta) {
        count.addAndGet(delta);

    }

    @Override
    public int getAccountCount() {
        return count.get();
    }
}
