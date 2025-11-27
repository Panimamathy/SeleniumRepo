package week3.day1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		for(int i=a[0];i<=a.length;i++) 
			if(i!=a[i-1]) {
				System.out.println(i);
			break;
		}
	}

}
