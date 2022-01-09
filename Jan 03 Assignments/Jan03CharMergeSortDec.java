package AssignmentWeek3;

import java.util.Scanner;

public class Jan03CharMergeSortDec {
	void merge(char[] a,int l,int r) {
		int m =l+(r-l)/2;
		int i=l, k=l, j=m+1;
		char temp[] = new char[a.length];
		
		while(i<=m && j<=r) {
			if(a[i]>a[j]) {
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
	 private void sort(char[] a,int l,int r) {
		if(l>=r)
			return;
		int m =l + (r-l)/2;
		
		sort(a,l,m);
		sort(a,m+1,r);
		merge(a,l,r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a[] = {'a','x','y','b','A','T','t'};
		
		Jan03CharMergeSortDec ob = new Jan03CharMergeSortDec();
		ob.sort(a,0,a.length-1);
		for(char i: a) {
			System.out.print(i+" ");
		}
	}

}
