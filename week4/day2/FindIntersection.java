package week4.day2;



public class FindIntersection {

	public static void main(String[] args) {
		int[] num1= {3,2,11,4,6,7};
		int[] num2= {1,2,8,4,9,7};
		
		int lengthOfNum1 = num1.length;
		System.out.println("The length of num1:" +lengthOfNum1);
		
		int lengthOfNum2 = num2.length;
		System.out.println("The length of num2:" +lengthOfNum2);
		
	    for(int i=1;i<num1.length;i++) {
	    	for(int j=1;j<num2.length;j++) {
	    		if(num1[i]!=num2[j]) {
	    			System.out.println("Equal Found");
	    		}
	    		else {
	    			System.out.println("Equal not Found");
	    		}
	    			
	    		}
	    }
	}
}
	    	



		
		
		
		
		
		
		
		
		
		
		
	