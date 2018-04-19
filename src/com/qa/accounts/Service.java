package com.qa.accounts;

import java.util.HashMap;

public class Service {

	private HashMap<Integer ,Account> accountMap;
	

	public Service() {
		accountMap=new HashMap<Integer,Account>();
	}
	
	public void addAccount(Account account) {
		
		if(!accountMap.containsKey(account.getAccountNumber())) {
			accountMap.put((int)account.getAccountNumber(), account);
		}
	
		else{
			System.out.println("Account exists");
		}
		
	}
		
		public void retrieveAccount(int accNum) {
			if(accountMap.containsKey(accNum)) {
				System.out.println(accountMap.get(accNum).printAccount());
		}
	}
		
		public HashMap<Integer,Account> getAccountMap() {
			return this.accountMap;
		}
		
		public int countingAccountsWithSameFirstName(String name) {
			
			int count = 0;
			for (Account account : accountMap.values()) {
				if (account.getFirstName().equals(name)) {
					count++;
				}
		}
			return count;
		}
		
		
		//System.out.println();
		//return count;
	//}
}