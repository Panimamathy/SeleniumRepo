package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8;  
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second);

        int next = first + second;

        while (next <= range) {
            System.out.print(" " + next);
            first = second;
            second = next;
            next = first + second;
        }
    
	}

}
