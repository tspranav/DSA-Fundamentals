package AssignmentsWeek2;

import java.util.Scanner;

public class Dec29BinarySearch {
	static int m=0;
	static void solve(int[] a,int t,int s,int e) {
		if(s>e) {
			System.out.println(-1);
		}
		m=e-(s+e)/2;
		if(a[m]==t) {
			System.out.println(m);
			return;
		}
		if(a[m]>t) {
			e =m-1;
		}
		else
		{
			s = m+1;
		}
		solve(a,t,s,e);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		solve(a,t,0,n-1);
		

	}

}
