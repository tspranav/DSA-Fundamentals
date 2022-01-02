package AssignmentsWeek2;

import java.util.Scanner;

public class Dec30Power {
	static int p=1;
	static int power(int x,int y) {
		if(y ==0) {
			return p;
		}
		p *= x;
		return power(x,y-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		System.out.println(power(x,y));
	}

}
