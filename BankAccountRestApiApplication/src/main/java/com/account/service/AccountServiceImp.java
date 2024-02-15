package com.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.account.entity.Account;
import com.account.repo.AccountRepo;
@Service
public class AccountServiceImp implements AccountService {
	@Autowired
	private AccountRepo accountrepo;

	@Override
	public Account saveRecords(Account account) {
		return accountrepo.save(account);
	}

	@Override
	public Account getOne(Long id) {
		Optional<Account> optionalAccount = accountrepo.findById(id);
        return optionalAccount.orElse(null);
		
	}

	@Override
	public List<Account> getAll() {
    return accountrepo.findAll();		
	}
	
	@Override
	public Account updateRecord(Account account, Long id) {
		Account a=accountrepo.findById(id).get();
		a.setAccountholdername(account.getAccountholdername());
		a.setBalance(account.getBalance());
	
		return accountrepo.save(a);	
	}

	@Override
	public void delete(long id) {
		accountrepo.deleteById(id);
		
	}

	
	
	}

	
	


