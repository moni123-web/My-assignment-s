package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		 int num=121;
	     int outputNum=0;
	     
         for(int i=num;i>0;i=i/10) 
	        {
	        int digit=i%10;
	        outputNum=outputNum*10+digit;
	        }
	        if(num==outputNum) 
	          {
	          System.out.println("It is a Palindrome");
	          }
	          else
	            {
	            System.out.println("It is not a Palindrome");
                }
	        
	}


	}


