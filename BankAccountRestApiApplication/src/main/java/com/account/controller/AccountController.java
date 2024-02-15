package com.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entity.Account;
import com.account.service.AccountService;

@RestController

public class AccountController {
	@Autowired 
	 private AccountService accountservice ; 
	 @PostMapping("/save") 
	 public String saveData(@RequestBody Account account) 
	 { 
	  Account e1=accountservice.saveRecords(account); 
	  String message=null; 
	  if(e1!=null)  
	  { 
	   message="Data Saved Successfully"; 
	  } 
	  else 
	  { 
	   message="Data Failed"; 
	  } 
	  return message; 
	 } 
	 @GetMapping("/get/{id}") 
	 public Account getOne(@PathVariable Long id) 
	 { 
	  Account get=accountservice.getOne(id); 
	  return  get; 
	 } 
	 @GetMapping("/getAll") 
	 public List<Account> getAll() 
	 { 
	  List<Account> getAll=accountservice.getAll(); 
	  return getAll; 
	 } 
	  
	 @DeleteMapping("/delete/{id}") 
	 public void delete(@PathVariable Long id) 
	 { 
		 accountservice.delete(id); 
	 }
   @PutMapping("/update/{id}")
	 public Account updateRecord(@RequestBody Account account,@PathVariable Long id) {
		 Account update=accountservice.updateRecord(account,id);
		return update; 
	 
}
}
