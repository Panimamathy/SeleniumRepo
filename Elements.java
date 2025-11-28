package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		WebElement call1 = new WebElement();
		call1.click();
		call1.setText("Apply");
		System.out.println("-------");
		Button call2 = new Button();
		call2.click();
		call2.submit();
		System.out.println("---------");
		TextField call3 = new TextField();
		call3.setText("Type");
		call3.getText();
		System.out.println("------");
		CheckBoxButton call4 = new CheckBoxButton();
		call4.click();
		call4.submit();
		call4.clickCheckButton();
		System.out.println("-----");
		Elements call = new Elements();
		call.click();
		call.setText("Words");
		call.submit();

	}

}
