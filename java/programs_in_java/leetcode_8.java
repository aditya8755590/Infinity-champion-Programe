import java.util.*;
public class leetcode_8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int x;
        String X1;
        String[] array = new String[s.length()];
        if (Character.isLetter(s.charAt(0))) {
            x = 0;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i)) == ' ') {
                    continue;
                } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    array[i] = Character.toString(s.charAt(i));
                } else if (Character.isDigit(s.charAt(i))) {
                    array[i] = Character.toString(s.charAt(i));
                } else {
                    break;
                }

            }

            // x=Integer.parseInt(X1);


        }
        X1 = array.toString();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println(X1);

    }
}