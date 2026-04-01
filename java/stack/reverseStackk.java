import java.util.Stack;
public class reverseStackk {
   Stack<Integer> st=new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         System.out.print("Before");
         System.out.println(st);
         reverseAStack(st);
        pushAtBottomWithOutRecursion(st, 5);
         System.out.print("After");
         System.out.println(st);
         }
         public static void reverseAStack(Stack<Integer> st){
          if(st.isEmpty()) return;
          int val=st.pop();
          reverseAStack(st);
          pushAtBottom(st,val);
         } 
        //  public static void pushAtBottom(Stack<Integer> st,int val){
        //   if(st.isEmpty()){
        //    st.push(val);
        //    return;
        //   }
        //   int x=st.pop();
        //   pushAtBottom(st, val);
        //   st.push(x);
        //  }
         public static void pushAtBottomWithOutRecursion(Stack<Integer> st,int val){
                Stack<Integer> st1=new Stack<>();
                while(!st.isEmpty()){
                        st1.push(st.pop());
                }
                
                st.push(val);
                while(!st1.isEmpty()){
                        st.push(st1.pop());
                }
         }
