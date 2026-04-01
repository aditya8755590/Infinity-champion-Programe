import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        // this programe is reverse a string 
        Scanner sc=new Scanner(System.in);
        String strName=sc.nextLine();
        StringBuilder sb =new StringBuilder(strName);
        System.out.println("ENTER THE FIST POSITION ");
        int i=sc.nextInt();
        System.out.println("ENTER LAST POSITION ");
        int j=sc.nextInt();
       while(i<j){
        int front=i;
        int back=j-1;
        char front_char= sb.charAt(front);
        char back_char= sb.charAt(back);
        sb.setCharAt(front, back_char);
        sb.setCharAt(back, front_char);
        i++;
        j--;
        
       }
       System.out.println(sb);
    }
    
}
