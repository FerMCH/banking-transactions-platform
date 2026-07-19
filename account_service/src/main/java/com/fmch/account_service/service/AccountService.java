package com.fmch.account_service.service;

import java.util.List;

import com.fmch.account_service.model.Account;

/**
 * Service interface for managing bank accounts.
 * Provides methods for creating accounts, retrieving account details, and fetching account balances.
 * 
 * @author FMCH
 */

public interface AccountService {

    Account createAccount(String client, String accountType, double accountBalance, String currency);

    Account getAccountByAccountNumber(String accountNumber);

    double getAccountBalance(String accountNumber);

    List<String> getAllAccountNumbersByClient(String client);
}
