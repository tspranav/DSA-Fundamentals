package AssignmentsWeek2;

import java.util.Scanner;

public class Dec29Avg {
	static int i=0,avg=0;
	static  int solve(int[] a) {
		if(i==a.length) {
			avg = avg/a.length;
			return avg;
		}
		avg += a[i++];
		return solve(a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		System.out.println( solve(a));

	}

}
