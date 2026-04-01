import java.util.Scanner;
public class reverse__a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev_no=0;
        int rem;
        while(num>0){
            rem=num%10 ;
            num=num/10;
            
        //    rev_no=rev_no+rem; 
        //    rev_no*=10;
        // for this after loop is fails so we have to divide the no by rev_no
          rev_no=rev_no*10+rem;
           }
        System.out.println(rev_no);
    }
    
}
