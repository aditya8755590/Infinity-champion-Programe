class LinkList {
    public static class Node{
        int data;
        Node next;
        public Node(int data ){
       this.data=data;
       this.next=null;
    
        }
    }
    static Node  head=null;
    static Node tail=null;
    static int  size=0;
    public static void remove_fist(){
           if(head!=null){
            head=head.next;
            if(head==null){
                tail=null;
            }
           }
        Node temp=head;
        head=head.next;

    }
    // public int findItera(int k){
    //       Node temp=head;
    //       int i=0;
    //       while(temp!=null){
    //         if(temp.data==k){
    //             return i;
    //         }
    //         temp=temp.next;
    //         i++;
    //       }
    //       return -1;
    // }
    public static void add_new_node(int data,int index){
        if(index==0){
            addFist(data);
            return ;

        }
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
public static void addFist(int data){
    //step1 = create new node
Node newNode = new Node (data);
    if(size==0){
        head= newNode;
        tail=newNode;
        size++;
    }
      if (head == null) {
           head = tail = newNode;
           return;
        }
//step2 - newNode next = head
newNode.next = head; //link

//step3 - head = newNode
head = newNode;
size++;

}

public void add_Last (int data) {
Node newNode = new Node (data) ;
if (head==null){
head = tail = newNode;
return;
}
// tail.next=newnode 
tail.next = newNode;// link

// tail shift to new node 
tail=newNode;
size++;
}
public void print(){
    Node temp=head;
while(temp!=null){
   System.out.print(temp.data+"->");
   temp=temp.next;
}
}
public void addAtAnypost(int t ,int ele){
        if(t==0){
            addFist(ele);
        }
        else if(t==size){
            add_Last(ele);
        }
            Node tem=new Node(ele);
           Node after=head;
            for(int i=1;i<t;i++){
               after=head.next;
            }

           Node s=after.next;
            after.next=tem;
            tem.next=s;

    }
    public void reverse(){
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
class main{
public static void main(String[] args) {
    LinkList l1=new LinkList();
        l1.addFist(2);
        l1.addFist(1);
        l1.add_Last(3);
        l1.add_Last(32);
       l1.add_Last(33);
       l1.add_Last(34);
       l1.add_Last(35);
       l1.add_Last(36);
       l1.addAtAnypost(2, 19);
       l1.print();
       l1.reverse();
       System.out.println("Here the reverse of the linkList ");
       l1.print();
      // l1.remove_fist();
//   remove_fist();

//System.out.println(l1.findItera(33)+"ye hai 2");
 
}
}