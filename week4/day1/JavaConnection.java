package week4.day1;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
	}

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disonnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

}
