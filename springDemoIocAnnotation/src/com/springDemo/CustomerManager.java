package com.springDemo;

public class CustomerManager implements ICustomerService  {
	
	private ICustomerDal customerDal;
	
	// constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		//i� ko�ullar� sa�land�ysa:
		customerDal.add();
		
	}

	

	

}
