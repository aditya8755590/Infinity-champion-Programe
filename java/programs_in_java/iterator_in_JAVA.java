import java.util.*;
public class iterator_in_JAVA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        Iterator<Integer> it=list1.iterator();
       
        while(it.hasNext()){
            System.out.println(it.next());
        }
        








        }
    
}
