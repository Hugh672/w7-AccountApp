package com.qa.accounts;

import static org.junit.Assert.assertEquals;
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
	
	@Test
	public void countingAccountsWithSameFirstNameRefactored() {
		service.addAccount(hugh);
		service.addAccount(hugh);
		Account account1 = new Account("Hugh","Grierson",1);
		Account account2 = new Account("Hugh","Grierson",2);
		Account account3 = new Account("Hugh","Grierson",3);
		service.addAccount(account1);
		service.addAccount(account2);
		service.addAccount(account3);
		int expected=3;
		
		int actual = service.countingAccountsWithSameFirstNameRefactored("Hugh");
		assertEquals(expected, actual);
	}
	
}