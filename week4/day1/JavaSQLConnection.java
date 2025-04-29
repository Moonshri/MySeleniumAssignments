package week4.day1;

public class JavaSQLConnection extends MySqlConnection
{

	public static void main(String[] args) {
		JavaSQLConnection Java = new JavaSQLConnection();
		Java.connect();
		Java.disconnect();
		Java.executeQuery();
		Java.sendQuery();
	}

	@Override
	public void connect() {
		System.out.println("DB connect");
	}

	@Override
	public void disconnect() {
		System.out.println("DB disconnect");
	}

	@Override
	public void executeUpdate() {
		System.out.println("DB update execution");
	}

	@Override
	void executeQuery() {
		System.out.println("DB query execute");

	}

	void sendQuery() {
		System.out.println("DB query sent");
		super.sendQuery();

	}

}
