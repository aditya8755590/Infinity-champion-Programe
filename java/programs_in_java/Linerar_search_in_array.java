import java.util.*;
public class Linerar_search_in_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,15,6,7};
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                System.out.println(i);
            }
            

        }
        System.out.println("-1");



    }
    
}
