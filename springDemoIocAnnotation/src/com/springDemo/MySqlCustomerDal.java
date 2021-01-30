package com.springDemo;

public class MySqlCustomerDal implements ICustomerDal {

	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		//veritaban� i�lemleri
		System.out.println("ConnectionString: " + this.connectionString);
		
		System.out.println("MySql Veri taban�na eklendi");
		
	}

}
