package AssigmentsWeek1;

import java.util.Scanner;

public class Dec21Sumof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		int t = sc.nextInt();
		/*for(int i=0;i<n;i++) {
			for(int j=i+1;i<n;i++) {
				if(a[i]+a[j] == t) {
					System.out.println(a[i]+" "+a[j]);
					System.exit(0);
				}
			}
		} */
		if (a == null || a.length == 0)
            System.out.println("0");
		
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int x = a[s] + a[e];
            if (x < t) {
                s++;
            } else if (x > t) {
                e--;
            } 
            else {
            	System.out.println(a[s]+" "+a[e]); 
            	break;
            }
        }
		

	}

}
