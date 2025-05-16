package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
	System.out.println("payment selected: cashOnDelivery");
	}
    @Override
	public void upiPayments() {
	System.out.println("payment selected: upiPayments");
	}
    @Override
	public void cardPayments() {
	System.out.println("payment selected: cardPayments");
	}
    @Override
	public void internetBanking() {
	System.out.println("payment selected: internetBanking");
	}
    @Override
	public void houseLoan() {
	System.out.println("payment selected: houseLoan");
	}
	public void recordPaymentDetails() {
	System.out.println("recordPaymentDetails is entered");
	}
	public static void main(String[] args) {
		Amazon paymentOptions=new Amazon();
		paymentOptions.cardPayments();
		paymentOptions.cashOnDelivery();
		paymentOptions.cardPayments();
		paymentOptions.internetBanking();
		paymentOptions.recordPaymentDetails();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
