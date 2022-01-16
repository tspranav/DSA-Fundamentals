package AssignmentsWeek4;

public class Jan10LinkedList {
	static LNode head;
	static class LNode{
		int data;
		LNode next;
		LNode(int val){
			this.data = val;
			this.next =null;
		}
	}
	static Jan10LinkedList insert(Jan10LinkedList LL,int data ){
		LNode new_node = new LNode(data);
		if(head == null) {
			LL.head = new_node;
		}
		else {
			LNode curr = LL.head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = new_node;
		}
		return LL;
		
	}
	static Jan10LinkedList delete(Jan10LinkedList LL,int index) {
		LNode curr = LL.head;
		if(index ==0 && curr != null) {
			LL.head = curr.next;
			System.out.println(index+" position is deleted");
			return LL;
		}
		int counter =0;
		while(curr != null) {
			if(counter == index-1) {
				LNode temp =  curr.next.next;
				curr.next = temp;
				System.out.println(index+" position is deleted");
				break;
			}
			else {
				curr = curr.next;
				counter++;
			}
		}
		if(curr == null) {
			System.out.println(index+" position element doesn't exist");
		}
		
		return LL;
		
	}
	static int search(Jan10LinkedList LL,int val) {
		int  p =0;
		LNode curr = LL.head;
		int flag =0;
		while(curr.next != null) {
			curr = curr.next;
			p++;
			if(curr.data == val) {
				flag = 1;
				break;
			}
			
			
		}
		if(flag ==0) {
			p =-1;
		}
		return p;
	}
	static void print(Jan10LinkedList LL) {
		LNode curr = LL.head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	static void printfrom(Jan10LinkedList LL,int p) {
		int count =1;
		LNode curr = LL.head;
		while(count <p) {
			curr = curr.next;
			count++;
		}
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		
	}
	public static void main(String[] args) {
		Jan10LinkedList LL = new Jan10LinkedList();
		 LL =insert(LL,1);
		 LL =insert(LL,2);
		 LL =insert(LL,3);
		 LL =insert(LL,4);
		 LL =insert(LL,5);
		 LL =insert(LL,6);
		 LL =insert(LL,7);
		 LL =insert(LL,8);
		 print(LL);
		 System.out.println();
		 printfrom(LL,4);
		 System.out.println();
		 System.out.println(search(LL,11));
		 delete(LL,5);
		 print(LL);

	}

}
