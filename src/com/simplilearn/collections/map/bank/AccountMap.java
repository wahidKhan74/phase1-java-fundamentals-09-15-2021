package com.simplilearn.collections.map.bank;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountMap {

	public static void main(String[] args) {
		//create account objects
		Account account1 = new Account("Ava Green", "ava.green@gmail.com", 8547544.45);
		Account account2 = new Account("Krishna Koppala", "kris.k@gmail.com", 7747544.45);
		Account account3 = new Account("Emma Kim", "emma.kim@gmail.com",6647544.45);
		Account account4 = new Account("David Miller", "david.m@gmail.com", 127544.45);
		Account account5 = new Account("Tony Stark", "tony.s@gmail.com", 6547544.45);
		
		// account mapp
		Map<Long, Account> accountMap =  new LinkedHashMap<Long, Account>();
		

		//add data
		accountMap.put(70000011L, account1);
		accountMap.put(70000012L, account2);
		accountMap.put(70000013L, account3);
		accountMap.put(70000014L, account4);
		accountMap.put(70000015L, account5);
		
		//print accoutMap
		System.out.println(accountMap);
		//get data
		System.out.println(accountMap.get(70000013L));
		
		// iterate over account
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			System.out.println("---------------");
			System.out.println("Account Number : "+entry.getKey());
			System.out.println("Account Details : "+entry.getValue().getBalance());
		}
	}

}
