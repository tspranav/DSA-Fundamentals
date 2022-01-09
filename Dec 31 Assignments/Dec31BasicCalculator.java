package AssignmentsWeek2;

import java.util.Scanner;

public class Dec31BasicCalculator {
	int i =0;
	char[] a ;
	int convert(String s) {
		a = s.toCharArray();
		return calc();
	}
	int calc() {
		int r =0,op = 1;
		
		while(i<a.length) {
			if(a[i] == ')') {
				break;
			}
			else if(a[i] == '(') {
				i++;
				r += op*calc();
			}
			else if(a[i] == '+') {
				op = 1;
			}
			else if(a[i] == '-'){
				op = -1;
			}
			else if((int)a[i] >=48 && (int)a[i] <=57) {
				int k = Integer.parseInt(String.valueOf(a[i]));
				r +=k*op;
			}
			i++;
		}
		
		return r;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Dec31BasicCalculator ob = new Dec31BasicCalculator();
		System.out.println(ob.convert(s));
		
		
		

	}

}
