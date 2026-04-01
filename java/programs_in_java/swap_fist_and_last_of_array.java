import java.util.Scanner;
public class swap_fist_and_last_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
    int array[]= new int[n];
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    int c =array[0];
    array[0]=array[array.length-1];
    array[array.length-1]=c;
    for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
    }

    
}
}
