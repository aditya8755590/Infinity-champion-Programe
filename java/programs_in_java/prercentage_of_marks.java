import java.util.Scanner;
public class prercentage_of_marks {
    public static void main(String[] args) {
       float sum=0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of physics");
        int num1= sc.nextInt();
        sum=sum+num1;
        System.out.println("enter marks of chemistry");
        int num2= sc.nextInt();
        sum=sum+num2;
        System.out.println("Enter marks of math");
        int num3= sc.nextInt();
        sum=sum+num3;
        System.out.println("enter marks of english");
        int num4= sc.nextInt();
        sum=sum+num4;
        System.out.println("Enter marks of hindi");
        int num5= sc.nextInt();
        sum=sum+num5;
       float percentage =(sum/5);
       System.out.println("this is your percentage "+percentage);

        
        
    }
    
}
