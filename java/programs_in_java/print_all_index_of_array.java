import java.util.Scanner;
public class print_all_index_of_array {
   public static void main(String[] args) {
    int[] array={1,1,1,1};
      System.out.println("ENTER THE KEY ");
      Scanner sc=new Scanner(System.in);
      int key=sc.nextInt();
      for(int i=0;i<array.length;i++){
        if(array[i]==key){
            System.out.print(i+",");
        }
      }

   }
    
}
