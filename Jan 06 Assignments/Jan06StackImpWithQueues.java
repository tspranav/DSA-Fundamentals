package AssignmentWeek3;


import java.util.ArrayDeque;
import java.util.Queue;

public class Jan06StackImpWithQueues {
	Queue<Integer> q1 = new ArrayDeque<>();
	Queue<Integer> q2 = new ArrayDeque<>();
	void push(int x) {
		while(!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		q1.offer(x);
		System.out.println(x+" is added into the queue");
		while(!q2.isEmpty()) {
			q1.offer(q2.poll());
		}
	}
	void pop() {
		if(q1.isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println(q1.poll()+" is removed from the queue");
		}
		
	}

	public static void main(String[] args) {
		Jan06StackImpWithQueues s = new Jan06StackImpWithQueues();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println();
		s.pop();
		s.pop();
		s.pop();
		

	}

}
