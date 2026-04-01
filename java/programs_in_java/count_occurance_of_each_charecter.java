import java.util.*;
public class count_occurance_of_each_charecter {
  public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int count=0;
        boolean flag=
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
                System.out.print(arr[i]+" "+count);



            }
        }
    }
}
  
// import java.util.Scanner;

// public class CountOccurrenceOfEachCharacter {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] arr = str.toCharArray();
//         boolean[] visited = new boolean[arr.length]; // To track already counted characters

//         for (int i = 0; i < arr.length; i++) { 
//             if (visited[i]) {
//                 continue; // Skip if already counted
//             }

//             int count = 0;
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }

//             System.out.println(arr[i] + " occurs " + count + " times");
//             visited[i] = true; // Mark as visited
//         }

//         sc.close(); // Closing the Scanner
//     }
// }

