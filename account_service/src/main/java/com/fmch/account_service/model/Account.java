package com.fmch.account_service.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Represents a bank account with details such as account number, client, account type, balance, currency, creation time, and active status.
 * 
 * @author FMCH
*/

@Data
@Entity
public class Account {

    @Id
    private String accountNumber;

    private String client;

    private String accountType;

    private double accountBalance;

    private String currency;

    private Instant createdAt;

    private boolean isActive;

}
