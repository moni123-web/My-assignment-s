package week3.day2;

public class WebElement {

	public void click() {
		System.out.println("click button");
	}
	
	public void setText() {
		System.out.println("Inheritance Concept");
	}
	
	public static void main(String[] args) {
	WebElement WebElementOptions=new WebElement();
	WebElementOptions.click();
	WebElementOptions.setText();
	}

}
