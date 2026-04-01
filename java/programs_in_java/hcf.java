import java.util.Scanner;
public class hcf {
    // public static void main(String[]args ){
    // Scanner sc= new Scanner(System.in);
    // int fist_num=sc.nextInt();
    // int sec_num=sc.nextInt();
    // int dividend;
    // int divisor;
    // if(fist_num>sec_num){
    //     dividend=fist_num;
    //     divisor=sec_num;
    // }
    // else{
    //     dividend=sec_num;
    //     divisor=fist_num;
    // }
    // while(divisor!=0){
    //     int remainder = dividend % divisor;
    //         dividend = divisor;
    //         divisor = remainder;

    // }
    // System.out.println("the HCF is "+dividend);
    // }    


    // khud ka socha hua 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max = (n>m) ? n : m;
        int i=2;
        int product=1;
        while(i<max){
            if(n%i==0&&m%i==0){
                product*=i;
                n=n/i;
                m=m/i;
            }
            else{
                i++;
            }
        }
        System.out.println(product);}
}
