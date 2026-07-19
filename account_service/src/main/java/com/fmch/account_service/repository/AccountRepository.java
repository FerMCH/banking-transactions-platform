package com.fmch.account_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmch.account_service.model.Account;
/**
 * Repository interface for managing Account entities in the database.
 * Extends JpaRepository to provide CRUD operations and additional query methods.
 * 
 * @author FMCH
 */

public interface AccountRepository extends JpaRepository<Account, String> {

}
