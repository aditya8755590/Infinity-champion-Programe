
//1019. Next Greater Node In Linked List
import java.util.*;

public class medimum1 {
     public int[] nextLargerNodes(ListNode head) {
          List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();  // Store indices of list elements

        for (int i = n-1; i >=0; i--) {

            while (!stack.isEmpty() && list.get(stack.peek()) <= list.get(i)) {

               stack.pop();

            }
            result[i] = stack.isEmpty()?0:list.get(stack.peek());
            stack.push(i);
        }

        return result;
        
    }
}
