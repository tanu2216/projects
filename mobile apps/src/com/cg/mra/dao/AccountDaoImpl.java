package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeException;

public class AccountDaoImpl implements AccountDao {
	
	Map<String, Account> accountEntry= new HashMap<String, Account>();
	
	public AccountDaoImpl() {
		
		accountEntry.put("9010210131", new Account("Prepaid", "Tanu", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Ollie", 453));
		accountEntry.put("9897496567", new Account("Prepaid", "Nitisha", 631));
		accountEntry.put("9010210132", new Account("Prepaid", "chutiya pongo", 521));
		accountEntry.put("9010210133", new Account("Prepaid", "Abhijjet sanki", 632));
		
	}

	@Override
	public Account getAccountDetails(String mobileNo) throws MobileRechargeException {
		
		
		if(accountEntry.containsKey(mobileNo)) {
			Account ac = accountEntry.get(mobileNo);
			return ac;
		}
		else{
		
			throw new MobileRechargeException("Mobile number does not exist");		
		}
	}
	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws MobileRechargeException {
	
		if(accountEntry.containsKey(mobileNo)) {
			Account ac = accountEntry.get(mobileNo);
			double bal = ac.getAccountBalance()+rechargeAmount;
			System.out.println("Your Account Recharged Successfully");
			System.out.println("Hello "+ac.getCustomerName()+", Available Balance is "+bal);
			return bal;
		}
		
		else{
			throw new MobileRechargeException("Mobile number does not exist!!");
	}
}
}
