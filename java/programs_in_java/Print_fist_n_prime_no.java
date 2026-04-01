import java.util.Scanner;
public class Print_fist_n_prime_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=2;
        int count=0;
        while(count<n){
            boolean flag=true;
            // here we check  only up to the squre root of the number so we can write it as i*i 
            // so there is like a mashine a vable called combine taht can carry out of both hervesting verry effictely there is another example of it is very nessary to wpork it as a 
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    flag=false;
                    break;


                }
            }
            if(flag){
                count++;
                System.out.print(x+",");
                
            }
            x++;

        }

        
        
    }
}
