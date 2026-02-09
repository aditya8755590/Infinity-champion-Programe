//2816. Double a Number Represented as a Linked List
public class hard1 {
     public ListNode doubleIt(ListNode head) {
          ListNode dummy=new ListNode(0);
          ListNode adi=dummy;
           ListNode rev=reverse(head);
           int carry=0;
           while(rev!=null||carry>0){
            if(rev!=null){
            int s=rev.val*2+carry;
            ListNode temp= new ListNode(s%10);
             carry=s/10;
              adi.next=temp;
              adi=adi.next;
             rev=rev.next;}
            else{
                 ListNode temp= new ListNode(carry);
                 adi.next=temp;
                // adi=adi.next;
                 break;
            }
          
           }
           return reverse(dummy.next);

    }





  static ListNode reverse(ListNode head){
    if(head==null||head.next==null){
        return head;
    }
    ListNode ans=reverse(head.next);
    ListNode temp=head.next;
       temp.next=head;
    //    ans.next=temp;
       head.next=null;
       return ans;

  }
}
