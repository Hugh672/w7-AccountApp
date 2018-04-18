package com.qa.accounts;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;
import org.junit.Test;

public class AccountManagerTest {
	Service service = new Service();
	Account hugh = new Account("Hugh","Grierson",1);

	
	@Test
	public void getAccountNumbertest() {
		assertEquals(1,hugh.getAccountNumber());
		service.addAccount(hugh);
		String result = AccountManager.accountsToJSON(service);
		String expected = "{\"firstName\":\"Hugh\",\"lastName\":\"Grierson\",\"accountNumber\":1}";
		assertEquals(result, expected);
	}

}