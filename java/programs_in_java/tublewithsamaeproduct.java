import java.util.ArrayList;

public class tublewithsamaeproduct {
 public static void main(String[] args) {
  int[] arr={2,3,4,6,8,12};
  int ans=tupleSameProduct(arr);
  System.out.println(ans);
   }
   public static int tupleSameProduct(int[] nums) {
  if(nums.length<4){
      return 0;
  }
 ArrayList<Integer> list=new ArrayList();
  for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
           list.add(nums[i]*nums[j]);
      }
  }
  for(Integer i:list){
   System.out.println(i+",");
  }
  int count=0;
  for(int i=0;i<list.size();i++){
      for(int j=i+1;j<list.size();j++){
          if(list.get(i)==list.get(j)){
              count++;
          }
      }
  }
return count;
}
 
}
