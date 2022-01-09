package AssignmentWeek3;

public class Jan06MyStack {
	static int max = 10;
	int top;
	int a[] = new int[max];
	Jan06MyStack(){
		top = -1;
	}
	
	void push(int x) {
		top++;
		if(top > max-1) {
			System.out.println("Stack over flow");
		}
		else {
			a[top] = x;
			System.out.println(a[top]+" is inserted into the stack");
		}
		
	}
	void pop() {
		if(top <0) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println(a[top--]+" is removed from the stack");
		}
		
	}
	void peek() {
		if(top <0) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println(a[top]+" is on top of the stack");
		}
		
	}

	public static void main(String[] args) {
		
		Jan06MyStack ms = new Jan06MyStack();
		ms.push(5);
		ms.push(11);
		ms.pop();
		ms.peek();
	}

}
