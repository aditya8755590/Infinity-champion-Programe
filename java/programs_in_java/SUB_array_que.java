public class SUB_array_que {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 2, -3, 3, -3,3};
        int T = 3;
        subarray(arr, T);
    }

    public static void subarray(int[] arr, int T) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                // Calculate the sum of subarray from index i to j
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // If the sum equals T, print the subarray
                if (sum == T) {
                    System.out.print("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(); // Move to the next line for the next subarray
                }
            }
        }
    }
}
