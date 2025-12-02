package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");

	}

	@Override
	public void executeUpdate() {
		System.out.println("execution updated");

	}

	public void executeQuery() {
		System.out.println("Query executed");
	}

	public static void main(String[] args) {
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();

	}

}
