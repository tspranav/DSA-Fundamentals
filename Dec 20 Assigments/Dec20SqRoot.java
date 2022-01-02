package AssigmentsWeek1;

import java.util.Scanner;

public class Dec20SqRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s=0;
		int e = t-1;
		int m =0;
		while(s<=e) {
			m = s+ ((e-s)/2);
			int sq =m*m;
			if(sq == t ) {
				System.out.println(m);
				break;
			}
			else if(sq>t) {
				e =m-1;
			}
			else {
				s =m+1;
			}
		}

	}

}
