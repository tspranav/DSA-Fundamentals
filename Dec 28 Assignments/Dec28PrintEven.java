package AssignmentsWeek2;

import java.util.Scanner;

public class Dec28PrintEven {
	public static void solve(int i,int n) {
		if(i>n) {
			return;
		}
		else {
			solve(i+2,n);
			System.out.print(i+",");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(0,n);

	}
}
