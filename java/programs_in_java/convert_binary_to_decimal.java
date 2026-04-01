import java.util.Scanner;

public class convert_binary_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int update=1;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*update;
            num=num/10;
            update=update*2;
        }
        System.out.println(sum);
    }
}
