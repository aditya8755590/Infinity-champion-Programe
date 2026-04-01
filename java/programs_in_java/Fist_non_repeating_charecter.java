import java.util.Scanner;
public class Fist_non_repeating_charecter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int i=1;
        char check = str1.charAt(0);
        System.out.println(check);
        while(i<str1.length()){
            if(check==(str1.charAt(i))){
                check=str1.charAt(i);
                i++;

            }
        }
        System.out.println(check);
      }

    
}
