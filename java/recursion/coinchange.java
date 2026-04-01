import java.util.*;
public class coinchange {
 public static void main(String[] args) {
     int[] arr={2,3,5};
     int target=8;
     int current =0;
     ArrayList<Integer> list=new ArrayList<>();
     //HashSet<ArrayList<Integer>> set=new HashSet<>();
     coinBack(arr,list,target,current);


 }
 public static void coinBack(int[] arr,ArrayList<Integer> list,int target,int current){
     if(current==target){
      System.out.println(list);
      return;
     }
     if(current>target){
      return ;
     }
     for(int i=0;i<arr.length;i++){
      list.add(arr[i]);
      coinBack(arr,list, target, current+arr[i]);
      list.remove(list.size()-1);
     }
 }
//  public static boolean hashMap(HashMap<Integer,Integer> map){
//   return true;
//  }

 
}
