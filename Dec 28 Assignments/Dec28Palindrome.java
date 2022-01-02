package AssignmentsWeek2;

import java.util.Scanner;

public class Dec28Palindrome {
	
	public static String solve(String s, String r,int n,int i) {
		if(i == n) {
			return "Palindrome";
		}
		if(s.charAt(i)== r.charAt(i)) {
			return solve(s,r,n,i+1);
		}
		else {
			return "Not Palindrome";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		String r =""+sb.reverse();
		int n = s.length();
		System.out.println(solve(s,r,n,0));

	}

}
