package AssignmentsWeek2;

import java.util.Scanner;

public class Dec29ReverseNum {
	static int r =0;
	static void solve(int n) {
		if(n==0) {
			System.out.println(r);
			return;
		}
		int d = n%10;
		r = r*10+d;
		solve(n/10);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
		

	}

}
