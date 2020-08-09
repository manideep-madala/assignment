package com.dxctraining.bankingapp.ui;


import com.dxctraining.bankingapp.entities.Account;
import com.dxctraining.bankingapp.exceptions.CustomerNotFoundException;
import com.dxctraining.bankingapp.exceptions.InvalidCustomerArgumentException;
import com.dxctraining.bankingapp.entities.*;
import com.dxctraining.bankingapp.exceptions.*;
import com.dxctraining.bankingapp.service.CustomerServiceImpl;
import com.dxctraining.bankingapp.service.ICustomerService;
import com.dxctraining.bankingapp.*;


import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;



public class CustomerMain {

	//private Map<String, Customer> store = new HashMap<>();
	
	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String[] args) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	// Customer[] customers = new Customer[4];
	public void runApp() {
		try {
			Account account1 = new Account(1, "11111pan");
			Account account2 = new Account(2, "11111pan");
			Account account3 = new Account(3, "11111pan");
			Account account4 = new Account(4, "11111pan");

			//boolean issame = account1 == account2;// is to check t1, t2 are referring same object
			//boolean isEquals = account1.equals(account2);// two object are equal (in content)
			//System.out.println("is same=" + issame);
			//System.out.println("is equal=" + isEquals);

			final String name1 = "ankit", name2 = "ayushi", name3 = "rahul", name4 = "mohan";

			Customer customer1 = new RegularCustomer("Jabalpur", 1, "Mohan",234,account1);
			//customer1.setAccount(account1);
			service.add(customer1);
			int id1 = customer1.getId();
			
			
			RegularCustomer customer2 = new RegularCustomer("Bhopal", 2, "Sohan", 4567,account2);
			//customer2.setAccount(account2);
			service.add(customer2);
			int id2=customer2.getId();
			
			BusinessCustomer customer3 = new BusinessCustomer("Indore", 3, "Rohan", 8910,account3);
			//customer3.setAccount(account1);
			service.add(customer3);
			int id3=customer3.getId();
			//service.delete(id3);
			service.updateName(customer3.getId(), "Rohan Rathore");
			
			BusinessCustomer customer4 = new BusinessCustomer("Raipur", 3, "Gohan", 1112,account4);
			//customer4.setAccount(account2);
			service.add(customer4);
			int id4 = customer4.getId(); 
			//displayAll();
			
			Customer fetched = service.findById(id3);
			display(fetched);
			System.out.print("*********diplaying All Customers ***********");
			displayAll();
			}
			catch(InvalidCustomerArgumentException e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
			}
			catch(CustomerNotFoundException e) {
			e.printStackTrace();
		 	System.out.println(e.getMessage());
			}	
			catch(Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
			}
				
	}
		public void displayAll() {
			List<Customer> list=service.findAll();
			for(Customer customer:list) {
				display(customer);
			}
		}
	
		public void display(Customer customer){
			System.out.println("  Customer  -- : " +customer.getId() +" "+customer.getName()
			+" "+customer.getBalance());
			
			Account account = customer.getAccount();
			System.out.println("  Customer  pursuing Account -- : " + account.getBalance() + " Pancard Number -- "
					+ account.getPancard());
			
			if (customer instanceof RegularCustomer) {
				RegularCustomer ca = (RegularCustomer) customer;
				System.out.println("Account is " + ca.getHouseAddress());
			}

			if (customer instanceof BusinessCustomer) {
				BusinessCustomer ca = (BusinessCustomer) customer;
				System.out.println("Account is " + ca.getBusinessAddress());

			}

		}
}
	
	
 