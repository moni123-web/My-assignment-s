package week2.day1;

public class Library {

	     public String addBook(String PrideandPrejudice)	{	 
		 System.out.println("Book added successfully:" +PrideandPrejudice);
		 return PrideandPrejudice;
		 }
         public void issueBook() 
         {
		 System.out.println("Book issued successfully");
		 }
         
        public static void main(String args[]) {
    	Library booksName=new Library();
    	booksName.addBook("Pride and Prejudice");
    	booksName.issueBook();
         
        } 
         
}
         


		
	
	
	
	
	