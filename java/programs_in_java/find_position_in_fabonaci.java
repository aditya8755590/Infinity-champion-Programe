import java.util.*;
public class find_position_in_fabonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fabonaci_number=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int position=2;
        if(b==fabonaci_number){
            System.out.println("2 "+"&"+" 3");
        }
        else if(a==fabonaci_number){
            System.out.println("1");
        }
        else{
            while(fabonaci_number!=b){
                c=b;
                b=a+b;
                a=c;
                position++;
            }
            System.out.println(position);

        }
    }
}
// IS MAI USER NAI AGAR ESA NO DALL DIYA JO KI SERIES MAI HAI HI NAHI TO  FIR KYA HOGA 
//YE GALAT INPUT DEGA KYO YE INFINATI LOOP TAK CHALAGA IS LIYE 
