package AssignmentWeek3;

import java.util.Stack;

public class Jan06QueueImpWithStacks {
	Stack<Integer> s1 = new Stack();
	Stack<Integer> s2 = new Stack();
	void enque(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		System.out.println(x+" is inserted in the queue");
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
	}
	void deque() {
		if(s1.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println(s1.pop()+" is removed from the queue");
		}
		
	}

	public static void main(String[] args) {
		Jan06QueueImpWithStacks q = new Jan06QueueImpWithStacks();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		System.out.println();
		q.deque();
		q.deque();
		q.deque();
		

	}

}
