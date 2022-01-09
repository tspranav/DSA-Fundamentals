package AssignmentWeek3;

import java.util.Scanner;

public class Jan03MergeSortAsc {
	private void merge(int a[],int l,int r) {
		int m =l+(r-l)/2;
		int i=l, k=l, j=m+1;
		int temp[] = new int[a.length];
		
		while(i<=m && j<=r) {
			if(a[i]<a[j]) {
				temp[k++] = a[i++];
			}
			else {
				temp[k++] = a[j++];
			}	
		}
		while(i<=m) {
			temp[k++] = a[i++];
		}
		while(j<=r) {
			temp[k++] = a[j++];
		}
		for(i=l;i<=r;i++) {
			a[i] = temp[i];
		}
	}
	private void sort(int a[],int l,int r) {
		if(l>=r)
			return;
		int m =l + (r-l)/2;
		
		sort(a,l,m);
		sort(a,m+1,r);
		merge(a,l,r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Jan03MergeSortAsc ob =new Jan03MergeSortAsc();
		ob.sort(a,0,n-1);
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
