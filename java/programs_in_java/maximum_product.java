import java.util.*;
public class maximum_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];   
        int l=sc.nextInt();
        int r=sc.nextInt();
        l--;
        r--;
        int max=0;
        int max1=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }



        for(int j=0;j<n;j++){
            if(j>=l&&j<=r){
                if(arr1[j]>max){
                    max=arr1[j];
                }
            if(j<=l&&j>=r){
                if(arr1[j]>max1){
                    max1=arr1[j];
                }

            }

            }
        }
        System.out.println(max*max1);
        
    
    
    
    
    
    
    
    }

    
}
