import java.util.Scanner;
public class Find_First_and_Last_Positions_of_an_Element_in_an_Array {

    public static void main(String[] args) {
        int[] array={1,2,2,2,3};
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int left=0;
        int right=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==element){
            left=i;
            right=array.length-i-1;
            break;
                
                }
            
            
    }
    System.out.println(left+","+right);
}
}
