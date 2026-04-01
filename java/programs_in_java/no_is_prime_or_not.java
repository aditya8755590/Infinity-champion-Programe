// import java.util.Scanner;
// public class no_is_prime_or_not {
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num<2){
//             System.out.println("it is not prime no.");
//         }
//         else{
//             int i;
//             int j=2;
//             for(i=2;i<=num;i++){
//                 if(num%i!=0){
//                    j++;
//                 }
//             }
//             System.out.println(j);
//             if(j==num){
//                 System.out.println("it is a prime no ");
//             }
//             else{
//                 System.out.println("it is not a prime no ");
//             }
//         }

//     }
// }
import java.util.Scanner;
public class no_is_prime_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         System.out.println("it is not prime no");
        //         flag=false;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("it is a prime no");
        // }
        // is mai i*i karange to code n ke squre root tak chalaga kyoki jitne bhi factor hote hai wo n ke root tak hi hote hai  
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                System.out.println("it is not prime no");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("it is a prime no");
        }
    }

    
}
