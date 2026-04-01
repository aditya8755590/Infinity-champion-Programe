import java.util.Scanner;
public class reverse_number_using_bitwise{
    public static void main(String[] args) {
        System.out.println("hello world ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swap "+a +" " +b);

         a=a^b;
         b=a^b;
         a=a^b;
        
         System.out.println("After swap "+ a +" " +b);
}
}

