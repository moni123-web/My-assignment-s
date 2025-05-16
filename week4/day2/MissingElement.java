package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		 // {1, 2, 3, 4, 10, 6, 8};
            List<Integer>numArray =new ArrayList<Integer>();
	        numArray.add(1);
	        numArray.add(2);
	        numArray.add(3);
	        numArray.add(4);
	        numArray.add(10);
	        numArray.add(6);
	        numArray.add(8);
	        System.out.println("The list is:" +numArray);
	        
	        Collections.sort(numArray);
	        
	        System.out.println("Missing numbers:");
	        for(int i=0;i<numArray.size()-1;i++) {
	            int max=numArray.get(i);
	            int min=numArray.get(i+1);

	            for (int j=max+1;j<min;j++) {
	                System.out.println(j);

	}

}
	}
}
