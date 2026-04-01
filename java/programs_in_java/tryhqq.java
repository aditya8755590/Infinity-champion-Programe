public class tryhqq {
   
        public static void main(String[] args) {
            int array1[] = {1, -2, -3, -4, 9, 1, -1, -5, -4};
            
            int maxSum = array1[0]; // Start with the first element
            int currentSum = array1[0];
            int start = 0, end = 0, tempStart = 0;
    
            // Iterate through the array
            for (int i = 1; i < array1.length; i++) {
                // If currentSum becomes negative, reset it to the current element
                if (currentSum + array1[i] < array1[i]) {
                    currentSum = array1[i];
                    tempStart = i;
                } else {
                    currentSum += array1[i];
                }
    
                // Update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            }
    
            // Output the subarray with the maximum sum
            System.out.println("Subarray with maximum sum:");
            for (int i = start; i <= end; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println("\nMaximum Sum: " + maxSum);
        }
    }
    

