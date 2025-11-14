package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=212;
		int original = input;
		int reversed = 0;
		for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;
            reversed = (reversed * 10) + rem;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome Number.");
        else
            System.out.println(original + " is NOT a Palindrome Number.");
    }
	

}
