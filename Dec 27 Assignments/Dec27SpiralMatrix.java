package AssignmentsWeek2;

import java.util.Scanner;

public class Dec27SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // no. of rows ( also used as row ending index)
		int n =sc.nextInt(); // no. of columns (also used as row ending index)
		int[][] a = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int k =0; // row starting index
		int l =0; // column starting index
		while(l<m&&k<n) {
			for(int i=k;i<n;i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(int i=k;i<m;i++) {
				System.out.print(a[i][n-1]+" ");
			}
			n--;
			if(k<m) {
				for(int i=n-1;i>=l;i--) {
					System.out.print(a[m-1][i]+" ");
					}
				m--;
			}
			if(l<n) {
				for(int i=m-1;i>=k;i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
			
			
		}
		

	}

}
