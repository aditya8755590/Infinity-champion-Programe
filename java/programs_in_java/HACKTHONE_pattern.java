public class HACKTHONE_pattern {
    public static void main(String[] args) {
        int divisior = -2147483648;
        int dividor = -1;

        // Special case to handle overflow
        int x;
        if (divisior == Integer.MIN_VALUE && dividor == -1) {
            x = Integer.MAX_VALUE;  // Assign the maximum int value
        } else {
            x = divisior / dividor;
        }
        System.out.println(x);
    }
}