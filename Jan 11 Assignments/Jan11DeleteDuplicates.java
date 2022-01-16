package AssignmentsWeek4;

import AssignmentsWeek4.Jan10LinkedList.LNode;

public class Jan11DeleteDuplicates  {
	 public LNode deleteDuplicates(LNode head) {
	        if(head == null){
	            return null;
	        }
	        if(head.next != null){
	            if(head.data == head.next.data){
	                head.next = head.next.next;
	                deleteDuplicates(head);
	            }
	        }
	        else{
	            deleteDuplicates(head.next);
	        }
	        return head;
	    }
}
