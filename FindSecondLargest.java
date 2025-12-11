package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int input[] =  {3, 2, 11, 4, 6, 7};
		List<Integer> second = new ArrayList<>(); {
			for(int n:input) {
				second.add(n);
			}
			Collections.sort(second);
			Integer integer = second.get(second.size()-2);
			System.out.println(integer);
		}
		
		
		

	}

}
