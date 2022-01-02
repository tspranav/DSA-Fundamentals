package AssigmentsWeek1;

import java.util.Scanner;

public class Dec21ArrayIntersec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt(), n2 = sc.nextInt();
		int[] a = new int[n1];
		int[] b =new int[n2];
		for(int i=0;i<n1;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n2;i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i]);
					
				}
			}
		}

	}

}
