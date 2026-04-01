import java.util.Scanner;

public class reverse_array {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    int[] array=new int[n];
   
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }


    // for(int i=0;i<n/2;i++){
    //     int temp=array[i];
    //     array[i]= array[array.length-1-i];
    //     array[array.length-1-i]=temp;
    // }
    // for(int i=0;i<n;i++){
    //     System.out.print(array[i]+" ");
    // }


    // lakin ye logic flop ho jayaga jab keva beech wale yaa sirf 4 se replace karna chalu hoga to
    int i=0;
    int j=n-1;
    // ab is mai hum dono i or j ko define kar saktae hai to ho jayga
    while(i<j){
        int temp=array[i];
       array[i]= array[j];
        array[j]=temp;
      i++;
      j--;
    }
    for( i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
   
}
}
