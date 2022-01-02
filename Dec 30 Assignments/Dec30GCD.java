package AssignmentsWeek2;

import java.util.Scanner;

public class Dec30GCD {
	static int solve(int x,int y,int p) {
		if(p==0) {
			return -1; //No G.C.D
		}
		if(x%p ==0 && y%p ==0) {
			return p;
		}
		return solve(x,y,p-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y = sc.nextInt();
		int p = Math.min(x, y);
		System.out.println(solve(x,y,p));
	}

}
