package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] Words = test.split(" ");
		for(int i=0;i<Words.length;i++) {
			if(i%2!=0) {
				char[] charArray = Words[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.println(charArray[j]);
				}
				System.out.println(" ");
				}
			else
			{
				System.out.println(Words[i] +" ");
		}
		
		}


	}

}
