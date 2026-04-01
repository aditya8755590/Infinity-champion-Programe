import java.util.Scanner;
import java.lang.Math;

public class gratest_common_divisor {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str1= sc.nextLine();
    String str2= sc.nextLine();
    Solution mergeAlternately= new Solution();

    String output = Solution.mergeAlternately(str1, str2);
    System.out.println(output);
   
}
 public class Solution {
    public String mergeAlternately(String str1, String str2) {
      int max_length=Math.max(str1.length(),str2.length());
        for(int i=0;i<=max_length;i++){
            if("str1.charAt(i)"=="str2.charAt(i)"){
                String output=output.Append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        return output.tostring();
        
    }
}
    
}
