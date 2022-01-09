package AssignmentWeek3;

import java.util.Scanner;
import java.util.Stack;

public class Jan06ValidParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> ms = new Stack();
		if(s.charAt(0)=='}'||s.charAt(0)==')') {
			System.out.println("Not Balanced");
			System.exit(0);
		}
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '('||c == '{') {
				ms.push(c);
			}
			else {
				if(c==')') {
					if(ms.peek() == '(') {
						ms.pop();
					}
					else {
						System.out.println("Not Balanced");
						break;
					}
				}
				if(c=='}') {
					if(ms.peek() == '{') {
						ms.pop();
					}
					else {
						System.out.println("Not Balanced");
						break;
					}
				}
			}
		}
		if(ms.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
		

	}

}
