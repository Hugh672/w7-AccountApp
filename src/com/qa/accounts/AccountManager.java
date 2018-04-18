package com.qa.accounts;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountManager {
	
	public static void main(String[] Args) {
	Service service = new Service();
	Account Hugh = new Account("Hugh", "Grierson", 1);
	service.addAccount(Hugh);
	service.retrieveAccount(1);
	accountsToJSON(service);

	}
	
	public static String accountsToJSON(Service service){
		String json = "";
		//System.out.println("Hello");
		
		Iterator <HashMap.Entry<Integer, Account>>it=service.getAccountMap().entrySet().iterator();
		while(it.hasNext()) {
			//System.out.println("hello");
			HashMap.Entry <Integer, Account> account=it.next();
			try {
				json += new ObjectMapper().writeValueAsString(account.getValue());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		System.out.println(json);
		return json;
	}
	
	
}
