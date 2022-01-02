package AssignmentsWeek2;

public class Dec28MinMaxRec {
	static void solve(int[] a,int i,int max,int min) {
		if(i==a.length) {
			System.out.println(max+" "+min);
			return;
		}
		if(a[i]>max) {
			max = a[i];
		}
		if(a[i]<min) {
			min =a[i];
		}
		solve(a,i+1,max,min);
	}
	public static void main(String[] args) {
		
		int a[] = {1,-1,0,2,3,-3,4,-4};
		solve(a,0,a[0],a[0]);

	}

}
