package springIntro;

public class CustomerDal implements ICustomerDal{
	
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
		System.out.println("Oracle veri taban�na eklendi.");
		
	}

}
