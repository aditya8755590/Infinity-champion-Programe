import java.util.*;
public class palindrome_of_string {
public static void main(String[] args) {
    System.out.println("ENTER THE STRING ");
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    StringBuilder str2=new StringBuilder(str1);
    int i=0;
    int k=str2.length();
    while(i<k){
        int front=i;
        int back=k-1;
        char front_char= str2.charAt(front);
        char back_char= str2.charAt(back);
        str2.setCharAt(front, back_char);
        str2.setCharAt(back, front_char);
        i++;
        k--;
    }
System.out.println(str2);
if (str1.equals(str2.toString())) {
    System.out.println("True");
} else {
    System.out.println("False");
}

    
}
}
