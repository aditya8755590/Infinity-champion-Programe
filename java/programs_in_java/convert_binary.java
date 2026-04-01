import java.util.Scanner;
import java.util.Arrays;



public class convert_binary {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int integer = sc.nextInt();
    int[] binary_num=new int[4];
    int rem;
    int i=0;

    while(integer>0){
        rem=integer%2;
        binary_num[i]=rem;
        integer=integer/2;
        i++;
    }
    // ise hum swap ki tharh kar rahe hai 1 position ko last se change kar denge 
    for (int j = 0; j < binary_num.length / 2; j++) {
        int temp = binary_num[j];
        binary_num[j] = binary_num[binary_num.length - 1 - j];
        binary_num[binary_num.length - 1 - j] = temp;
    }
    System.out.println(Arrays.toString(binary_num));


       

     
    }
    
}
