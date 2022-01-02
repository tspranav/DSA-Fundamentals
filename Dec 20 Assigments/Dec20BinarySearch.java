package AssigmentsWeek1;
import java.util.Scanner;

public class Dec20BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {-1,0,3,5,9,12};
		int s =0;
		int e = a.length-1;
		int t = sc.nextInt();
		int m=0;
		int d=0;
		while(s<=e) {
			 m = e - ((s+e)/2);
			if(a[m]==t) {
				System.out.println(m);
				d= 1;
				break;
			}
			else if(a[m]<t) {
				s =m+1;
			}
			else {
				e =m-1;
			}
		}
		if(d==0) {
			System.out.println("-1");
		}

	}

}
