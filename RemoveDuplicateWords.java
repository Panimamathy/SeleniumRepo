package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] Words = text.split(" ");
		for (int i = 0; i < Words.length; i++) {
			for (int j = i+1; j < Words.length; j++) {
				if (Words[i].equalsIgnoreCase(Words[j])) {
					Words[j] = "";
					count++;
				}

			}

		}

		if (count >= 1)
			for (int i = 0; i < Words.length; i++) {
				System.out.println(Words[i] + " ");
			}

	}

}
