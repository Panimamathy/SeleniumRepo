package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Upi payment success");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internt banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("record payment");
		
	}
	
	public static void main(String[] args) {
		Amazon order = new Amazon();
		order.cardPayments();
		order.upiPayments();
		order.internetBanking();
		order.recordPaymentDetails();
		
	}

}
