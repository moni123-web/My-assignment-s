package week4.day1;

public class ApiClient {
	
	public void sendRequest (String  a) {
		System.out.println("Version 1 =String for the endpoint");
		System.out.println(a);
		
	}
	public void sendRequest  (String a,String b,String c) {
		System.out.println("Version = 6, 3");
		System.out.println(a+" "+b+" "+c);
		
		
	}
	
	public static void main(String[] args) {
		
		ApiClient endPoint = new ApiClient();
		endPoint.sendRequest("a");
		endPoint.sendRequest("a","b","c");
	}
}
		
	

	




	
