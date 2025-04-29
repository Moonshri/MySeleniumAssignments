package week4.day1;

public class APIClient {
	//method with 1 argument
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint is "+endpoint);
	}
	// overloading method with 3 argument
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("The endpoint, request body and status are "+endpoint+", "+requestBody+" and "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient API = new APIClient();
		//calling both methods
		API.sendRequest("http:/site/v1");
		API.sendRequest("http:/v2/site", "message", "status100");
	}
}
