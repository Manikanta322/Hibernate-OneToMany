package com.sathya.dao.impl;


import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.dao.ICustomerDao;
import com.sathya.entity.Customer;
import com.sathya.entity.Item;
import com.sathya.util.HibernateUtil;

public class CustomerDaoImpl implements ICustomerDao {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	public void saveCustomer(Customer customer) {
		Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(customer);
		tx.commit();
		session.close();
	}
		
//Adding one more item
public void addItemToCustomer(Item item, Integer customerId) {
	Session session = factory.openSession();
	Customer customer = (Customer)session.get(Customer.class,customerId);
	Set<Item> items = customer.getItems();
	Transaction tx = session.beginTransaction();
	items.add(item);
	tx.commit();
	session.clear();
	
}

public void removeItemFromCustomer(Integer itemId, Integer customerId) {
     Session session = factory.openSession();
     Customer customer = session.get(Customer.class, customerId);
     Set<Item> items   =customer.getItems();
     Item item = session.get(Item.class,itemId);
     Transaction tx = session.beginTransaction();
     session.delete(item);
     tx.commit();
     session.close();
     
	
}

// delete item from customer



}
