package AssigmentsWeek1;

import java.util.Scanner;

public class Dec20Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				c++;
			}
		}
		System.out.println(c);
		

	}

}
