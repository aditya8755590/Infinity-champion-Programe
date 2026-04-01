import java.util.*;
public class printLinkList {
 public static void main(String[] args) {
  Node l1=new Node(2);
  l1.add_first(50);
  l1.add_first(77);
  l1.add_first(55);
  l1.add_first(3);
  l1.add_first(333);
  l1.print();
  }

}
// class linklist{
class Node{
 int data;
 Node next;
 Node(int data){
  this.data=data;
  this.next=null;
 }

static Node head=null;
static Node tail=null;
int size=0;

 void add_first(int data){
  Node temp=new Node(data);
  temp.next=head;
  head=temp;
  if(tail==null){
    tail=head;
  }
  size++;
 }
void print(){
  Node current=head;
  while(current!=null){
    System.out.println(current.data+">-");
    current=current.next;
  }
}
public void rev(){
  Node prev=null;
  Node curr=tail=head;
  Node next;
  while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  head=prev;
}
}
