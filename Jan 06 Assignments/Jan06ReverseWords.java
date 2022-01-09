package AssignmentWeek3;

import java.util.Scanner;
import java.util.Stack;

public class Jan06ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack();
		for(int i= 0;i<=s.length()-1;i++) {
			st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
		

	}

}
