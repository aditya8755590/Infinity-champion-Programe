import java.util.Scanner;
public class fibonaci_number {
    public static void main(String[] args) {
        //find the value at givien position
        // Scanner sc=new Scanner(System.in);
        // int position=sc.nextInt();
        // int a=0;
        // int b=1;
        // int c;
        // int i=0;
        // while(i<=position){
        //     c=b;
        //     b=a+b;
        //     a=c;
        //     i++;

        // }
        // System.out.println(a);
        //to find the no it is in fabbonaci or not
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        while(num>a){
            c=b;
            b=a+b;
            a=c;
        }
        if(num==a){
            System.out.println("yes");
            
        }
        else{
            System.out.println("No");
        }
    }
    
}
