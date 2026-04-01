import java.util.*;
public class StackImp {
 public static void main(String[] args) {
 // Stack st=new Stack();
 Stack<Integer> st=new Stack<>();
  st.push(5);
  st.push(4);
  st.push(3);
  System.out.println(st);
 }
}
// class Stack{
//  int arr[];
//  int idx;
//  Stack(){
//   arr = new int[5];
//   idx = -1;
//  }
//  Stack(int data){
//   int[] arr=new int[data];
//   idx=-1;
//  }
//  public void push(int data){
//   arr[idx+1]=data;
//   idx++;
//  }
//  public int pop(){
//   if(isEmpty()){
//    System.out.println("stack is empty");
//   }
//     int x=arr[idx];
//      idx--;
//      return x;
//  }
//  public int size(){
//   return idx+1;
//  }
//  public boolean isEmpty(){
//   return -1==idx;
//  }
//  public void print(){
//   if(isEmpty()){
//    System.out.println("Stack is empty");
//   }
//   for(int i=0;i<=idx;i++){
//    System.out.println("|"+arr[i]+"|");
//    System.out.println();
//   }
//   System.out.println("END");
 }

}
