import java.util.Scanner;
public class replace_a_digit_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. ");
        int num=sc.nextInt();
        System.out.println("Enter the digit you want to replace ");
        int d1=sc.nextInt();
        System.out.println("ENTER THE NO YOU WANT TO REPLACE WITH");
        int d2=sc.nextInt();
        int rep=0;
        int digit;
        int digit2;
        int replace_digit=0;
        while(num>0){
            digit=num%10;
            if(digit==d1){
                digit=d2;
            }
            rep=rep*10+digit;
            num=num/10;
        }
        while(rep>0){
            digit2=rep%10;
            replace_digit=replace_digit*10+digit2;
            rep=rep/10;

        }
        


        System.out.println("This is your replace no."+replace_digit);
       

    }
    
}
