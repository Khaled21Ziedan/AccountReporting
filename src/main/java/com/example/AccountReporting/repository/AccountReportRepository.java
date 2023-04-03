package com.example.AccountReporting.repository;

public interface AccountReportRepository {
    void incrementNumberOfCreatedAccounts(int delete);
    int getAccountCount();
}
