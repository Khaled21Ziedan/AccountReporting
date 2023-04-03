package com.example.EventSourcing.events;


import com.example.EventSourcing.dto.AccountType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountCreatedEvent {
    private String accountId;
    private String name;
    private int initialBalance;
    private AccountType accountType;
}
