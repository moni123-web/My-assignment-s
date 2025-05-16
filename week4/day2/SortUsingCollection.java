package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		 List<String>stringArray =new ArrayList<String>();
	     stringArray.add("HCL");
	     stringArray.add("WIPRO");
	     stringArray.add("ASPIRE SYSTEMS");
	     stringArray.add("CTS");
	     System.out.println("The String List is:" +stringArray);
	     
	     Collections.sort(stringArray);

	     System.out.println("Reversed sorted list:" +stringArray);
	        for(int i=stringArray.size()-1;i>=0;i--) {
	            System.out.print(stringArray.get(i));
	            if(i!=0) {
	                System.out.print(",");
	            }

	        }
	}
}










