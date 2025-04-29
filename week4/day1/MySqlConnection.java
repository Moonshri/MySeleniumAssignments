package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection{
	abstract void executeQuery();
	void sendQuery() {
		System.out.println("MySql query sent");
	}

}
