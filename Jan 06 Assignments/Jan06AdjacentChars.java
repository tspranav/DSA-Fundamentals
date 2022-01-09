package AssignmentWeek3;

import java.util.Scanner;
import java.util.Stack;

public class Jan06AdjacentChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> ms = new Stack();
		ms.push(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--) {
			if(s.charAt(i) != ms.peek()) {
				ms.push(s.charAt(i));
				System.out.print(ms.peek());
			}
		}
		System.out.println();
		while(!ms.isEmpty()) {
			System.out.print(ms.pop());
		}
		

	}

}
