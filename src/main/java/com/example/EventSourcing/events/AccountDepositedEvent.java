package com.example.EventSourcing.events;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountDepositedEvent {
    private String accountId;
    private int amount;
}
