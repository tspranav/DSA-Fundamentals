package AssignmentsWeek4;

class Jan11MergeSortedLL {
    public Node mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp =result;
        
        while(l1 != null || l2 !=null){
            if( l1==null){
                temp.next = l2;
                break;
            }
            if(l2==null){
                temp.next = l1;
                break;
            }
            if(l1.val<l2.val){
                temp.next =l1;
                l1 = l1.next;
            }
            else{
                temp.next =l2;
                l2=l2.next;
            }
            temp =temp.next;
        }
        return result.next;
    }
}