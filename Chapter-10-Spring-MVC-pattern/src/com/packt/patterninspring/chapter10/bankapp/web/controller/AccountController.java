/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.packt.patterninspring.chapter10.bankapp.model.Account;
import com.packt.patterninspring.chapter10.bankapp.service.AccountService;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.initDirectFieldAccess();
		//binder.setDisallowedFields("id");
		//binder.setRequiredFields("name", "balance");
	}
	
	@ModelAttribute
	public Account account() {
		return new Account();
	}
	
	@GetMapping(value = "/open-account")
	public String openAccountForm (){
		return "accountForm";
	}
	
	@PostMapping(value = "/open-account")
	public String save (@Valid @ModelAttribute("account") Account account, Errors errors){
		if (errors.hasErrors()) {
			return "accountForm";
		}
		accountService.open(account);
		return "redirect:/accounts/"+account.getId();
	}
	
	@GetMapping(value = "/accounts/{accountId}")
	public String getAccountDetails (ModelMap model, @PathVariable Long accountId){
		Account account = accountService.findOne(accountId);
		model.put("account", account);
		return "accountDetails";
	}
	
	@GetMapping(value = "/all-accounts")
	public String all (ModelMap model){
		List<Account> accounts = accountService.findAllAccounts();
		model.put("accounts", accounts);
		return "accounts";
	}
}
