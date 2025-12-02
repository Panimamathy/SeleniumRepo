package week4.day1;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,String requestStatus) {
		System.out.println(endpoint + " "+requestBody + " "+requestStatus);
		

	}

	public static void main(String[] args) {
		APIClient Obj = new APIClient();
		Obj.sendRequest("Endpoint");
		Obj.sendRequest("Endpoint", "Requestbody", "Request status");

	}

}
