package week3.day2;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("Select Radio Button");
	}

	public static void main(String[] args) {
		
		RadioButton radioOptions=new RadioButton();
		radioOptions.selectRadioButton();
		radioOptions.click();
		radioOptions.setText();
		radioOptions.submit();
		
		

	}

}






