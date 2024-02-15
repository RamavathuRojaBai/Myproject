package com.account.service;


import java.util.List;

import com.account.entity.Account;


public interface AccountService {
	public Account saveRecords(Account account);
	public Account getOne(Long id);
	public List<Account> getAll();
	public void delete(long id);
	public Account updateRecord(Account account,Long id);
	
		
	}



