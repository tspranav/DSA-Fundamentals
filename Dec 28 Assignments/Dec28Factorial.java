package AssignmentsWeek2;

import java.util.Scanner;

public class Dec28Factorial {
	static int p =1;
	public static int solve(int n) {
		if(n ==0) {
			return p;
		}
		else {
			p *= n;
			return solve(--n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solve(n));

	}

}
