//1290. Convert a Binary Number in a Linked List to an Integer

public class easy1{
     public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
              char ch=(char) (temp.val+'0');
              temp=temp.next;
              sb.append(ch);   
        }      
        return Integer.parseInt(sb.toString(), 2);
    }
    
}
