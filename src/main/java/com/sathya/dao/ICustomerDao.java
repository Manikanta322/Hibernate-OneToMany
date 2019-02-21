package com.sathya.dao;

import com.sathya.entity.Customer;
import com.sathya.entity.Item;

public interface ICustomerDao {
	
	public void saveCustomer(Customer customer);
	public void addItemToCustomer(Item item,Integer customerId);
	public void removeItemFromCustomer(Integer itemId,Integer customerId);

}
