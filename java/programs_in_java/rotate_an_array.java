import java.util.*;
public class rotate_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    int nums[]={7,1,2,23,4,5,6,6};

        int i=0;
        int j=nums.length-1;
        
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        // for(i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        //  }

        System.out.println("Enter times you rotate");
        int k=sc.nextInt();
        i=0;
        //lakin agar k jo hai agar wo nums.length se bada hoga to fir 
        //is liye hum k=k%nums.leanght kar denge 
        k=k%nums.length;
        j=k-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=k;
        j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
             }
    

    }

    }


    

