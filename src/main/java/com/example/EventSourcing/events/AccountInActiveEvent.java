package com.example.EventSourcing.events;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountInActiveEvent {
    private String accountId;
}
