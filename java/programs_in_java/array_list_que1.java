import java.util.*;
import java.util.ArrayList;

public class array_list_que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println("enter list fist");
        for(int i=0;i<5;i++){
            list1.add(sc.nextInt());
        }
        // System.out.println("enter list second ");
        // for(int i=0;i<5;i++){
        //     list2.add(sc.nextInt());
        // }

        // for(int i=0;i<5;i++){
        //     if(list1.contains(list2.get(i))){
        //         list1.remove(list2.get(i));
        //     }
           
        // }
        // System.out.println(list1);



        //# code for remove duplicate element 
        for(int i=0;i<5;i++){
            if(list2.contains(list1.get(i))==false){
                list2.add(list1.get(i));
            }

        }
        System.out.println(list2);
        System.out.println("by iterate by for loop ");
        for(int x:list2){
            System.out.println(x);
        }
    }
    
}
