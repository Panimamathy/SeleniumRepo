package week3.day2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String Text1 = "stops";
		String Text2 = "potss";
		if (Text1.length() != Text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		return;
		}
		char[] charArray1 = Text1.toCharArray();
		char[] charArray2 = Text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram.");
		} else
			System.out.println("The given strings are not an Anagram.");
	
	}
}