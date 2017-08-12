/**
 * 
 */
package com.doj.webapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doj.webapp.model.Account;
import com.doj.webapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class AccountController {
	
	@Autowired
	TransferService transferService;
	
	@RequestMapping(value = "/open-account", method = RequestMethod.GET)
	public String create (){
		return "account";
	}
	
	@RequestMapping(value = "/open-account", method = RequestMethod.POST)
	public String save (Account account, ModelMap model){
		account = transferService.open(account);
		model.put("account", account);
		return "account";
	}
	
	@RequestMapping(value = "/all-accounts", method = RequestMethod.GET)
	public String all (ModelMap model){
		List<Account> accounts = transferService.findAllAccounts();
		model.put("accounts", accounts);
		return "accounts";
	}
}
