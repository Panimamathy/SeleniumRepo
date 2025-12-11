package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingReverse {

	public static void main(String[] args) {
		String[] company = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> reverse = new ArrayList<String>();
		for (String n : company) {
			reverse.add(n);

		}

		Collections.sort(reverse);
		for (int i = reverse.size() - 1; i >= 0; i--) {
			System.out.println(reverse.get(i));
		}
	}

}
