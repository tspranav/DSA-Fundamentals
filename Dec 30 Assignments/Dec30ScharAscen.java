package AssignmentsWeek2;

import java.util.Scanner;

public class Dec30ScharAscen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  =sc.next();
		
		int a[] =new int[256];
		for(int i=0;i<s.length();i++) {
			int ind =  s.charAt(i);
			a[ind]++;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i];j++) {
				System.out.print((char)(i));
			}
		}

	}

}
