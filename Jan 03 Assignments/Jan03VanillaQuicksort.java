package AssignmentWeek3;

import java.util.Scanner;

public class Jan03VanillaQuicksort {
	int partition(int[] a,int l,int r){
		int p =a[r];
		int i=l-1;
		for(int j=l;j<r;j++) {
			if(a[j]>=p) {
				continue;
			}
			else {
				++i;
				int temp = a[i];
				a[i] = a[j];
				a[j] =temp;
			}
			
		}
		i++;
		int temp = a[i];
		a[i] = a[r];
		a[r] =temp;
		
		return i;
		
	}
	void sort(int a[],int l,int r) {
		if(l>=r)
			return;
		int p = partition(a,l,r);
		sort(a,l,p-1);
		sort(a,p+1,r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] =sc.nextInt();
		}
		Jan03VanillaQuicksort ob = new Jan03VanillaQuicksort();
		ob.sort(a,0,n-1);
		
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
