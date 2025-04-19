package week3.day2;

public class Elements implements Button {

	public static void main(String[] args) {

		Elements ele = new Elements();
		ele.click();
		ele.clickCheckbutton();
		ele.selectRadiobutton();
		ele.submit();
		ele.setText("set text");
		ele.getText("get text");
	}


	public void click() {
		System.out.println("click");

	}

	public void setText(String s) {
		System.out.println(s);
}
	void getText(String s) {
		System.out.println(s);
	}

	public void submit() {
		System.out.println("submitbuttonclick");

	}
	void clickCheckbutton() {
		System.out.println("checkbuttonclick");
	}
	void selectRadiobutton() {
		System.out.println("radiobuttonclick");
	}
}
