package week2.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int number=29;
		boolean isPrime=true;

		if (number<=1) 
		{
		isPrime=false;
		}
        else
        {
		for(int i=2;i<number;i++)
		   {
		    if(number %i==0)
		    {
			isPrime=false;
		    break;
		    }
		}
         if(isPrime) 
            {
		    System.out.println("The prime number:" +number);
			} 
            else
            {
		    System.out.println("Not prime number:" +number);
	        }

}

	}

}
