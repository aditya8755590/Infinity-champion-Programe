 import java.util.*;
public class boston_number {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int last;
        int factor_sum=0;
        int digit_sum=0;
     int temp=number;
     int temp2=number;
     while(temp>0){
        last=temp%10;
        temp=temp/10;
        digit_sum+=last;
     }



int i=2;
           while(i<=number){
            if(temp2%i==0){
                int j=i;
                System.out.print(j+"^");
                temp2=temp2/i;
                while (j>0) {
                last=j%10;
                j=j/10;
                factor_sum+=last;
                    }
                 }
            else{
                i++;
            }
        }
        System.out.println(factor_sum+","+digit_sum);
        if(factor_sum==digit_sum){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        

    }
}