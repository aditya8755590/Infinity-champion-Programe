//2095. Delete the Middle Node of a Linked List
public class easy2 {
     public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        // if(size==1){
        //     return null;
        // }
        // if(size==2){
        //     head.next=null;
        //     return head;
        // }
        int mid=(size/2);
        temp=head;
       ListNode temp1=dummy;
        for(int i=0;i<size;i++){
            if(i==mid){
                temp=temp.next;
                temp1.next = null;
                continue;
            }
            else{
             temp1.next=temp;
            temp1=temp1.next;
            temp=temp.next;
            }
        }

        return dummy.next;
    }
}
