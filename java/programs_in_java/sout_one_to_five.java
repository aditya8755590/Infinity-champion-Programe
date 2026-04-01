public class sout_one_to_five {
    public static void main(String[] args) {
        System.out.println(print(5));
    }
    public static String print(int n) {
        if (n == 1) {
            return "1";
        }
        return print(n - 1);
    }
    
}
