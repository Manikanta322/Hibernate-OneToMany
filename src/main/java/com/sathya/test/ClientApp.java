package com.sathya.test;

import com.sathya.dao.ICustomerDao;
import com.sathya.dao.impl.CustomerDaoImpl;
import com.sathya.entity.Item;

public class ClientApp {
	
public static void main(String[] args) {
	
	ICustomerDao dao = new CustomerDaoImpl();
	/*Item i1 = new  Item();
	i1.setItemId(101);
	i1.setItemName("LAPTOP");
	
	Item i2 = new Item();
	i2.setItemId(102);
	i2.setItemName("MOBILE");
	
	Item i3 = new Item();
	i3.setItemId(103);
	i3.setItemName("PENDRIVE");
	
	Customer customer = new Customer();
	customer.setCustomerId(1);
	customer.setCustomerName("A");
	
	Set<Item> items = new HashSet<Item>();
	items.add(i1);
	items.add(i2);
	items.add(i3);
	customer.setItems(items);
	dao.saveCustomer(customer);*/
	
	/*Item i5 = new Item();
	i5.setItemId(105);
	i5.setItemName("CARD ");
	dao.addItemToCustomer(i5,1);*/
	 
	dao.removeItemFromCustomer(103, 1);

}

}
