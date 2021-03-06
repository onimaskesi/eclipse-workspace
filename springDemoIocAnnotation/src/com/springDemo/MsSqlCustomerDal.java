package com.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("database")
public class MsSqlCustomerDal implements ICustomerDal {
	
	@Value("${database.connectionString}")
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
		System.out.println("MsSql veri taban�na eklendi");
		
	}

}
