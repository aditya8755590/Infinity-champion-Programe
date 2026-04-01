import java.util.Scanner;
public class print_prime_no_between_x_y {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x =sc.nextInt();
    int y =sc.nextInt();
    
    for(int i=x;i<=y;i++){
        if(check_prime(i)){
            System.out.println(i);
        }
    }
       public static  boolean check_prime(int n){


    }



}    
}
