import java.util.Scanner;
public class max_min_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
    int array[]= new int[50];
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    // idhar 0 is liye nahi lya kyo ki array mai -1,-2,-3 bhi to ho sakta hai naa 
    int max=array[0];
    int min=array[0];
    for(int i=0;i<n;i++){
        if(array[i]>max){
            max=array[i];
        }
        if(array[i]<max){
            min=array[i];
        }
    }
    System.out.println("THE MAXIMUM VALUE IS "+max);
    System.out.println("THE MINIMUM VALUE IS "+min);
}
}
