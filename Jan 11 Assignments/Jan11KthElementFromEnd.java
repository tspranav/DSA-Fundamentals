package AssignmentsWeek4;

public class Jan11KthElementFromEnd {
	static Lnode head;
	static class Lnode{
		 int data;
		 Lnode next;
		Lnode(int val){
			this.data = val;
			this.next = null;
			
		}
	}
	static Jan11KthElementFromEnd insert(Jan11KthElementFromEnd LL,int data) {
		Lnode new_node = new Lnode(data);
		if(LL.head == null) {
			LL.head = new_node;
			
		}
		else {
			Lnode curr = LL.head;
			while(curr.next !=null) {
				curr = curr.next;
			}
			curr.next = new_node;
		}
		return LL;
	}
	static void find(Jan11KthElementFromEnd LL,int p) { //Transverse
		
		int len =0;
		Lnode curr = LL.head;
		while(curr != null) {
			curr = curr.next;
			len++;
		}
		curr = LL.head;
		if(len<p)
			System.out.println("Invalid input");
		
		else {
			for(int i=1;i<len-p+1;i++) {
				curr = curr.next;
			}
			System.out.println(curr.data);
		}

	}
	static void find_tp(Jan11KthElementFromEnd LL,int p) { // Two pointer
		Lnode curr = LL.head;
		Lnode point = LL.head;
		for(int i=0;curr!=null&&i<p;i++) {
			curr =curr.next;
			if(curr == null && i!=p-1) {
				System.out.println("Invalid");
				return;
			}
		
		}
		while( curr !=null) {
			point = point.next;
			curr = curr.next;
		}
		System.out.println(point.data);
		
		
	}
	
	public static void main(String[] args) {
		Jan11KthElementFromEnd LL = new Jan11KthElementFromEnd();
		LL.insert(LL, 1);
		LL.insert(LL, 2);
		LL.insert(LL, 3);
		LL.insert(LL, 3);
		LL.insert(LL, 5);
		
		LL.find(LL, 3);
		LL.find_tp(LL, 3);
		

	}

}
