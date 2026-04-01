import java.util.Scanner;

public class transpose_of_a_matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        int row=sc.nextInt();
        System.out.println("Enter the no of coloumn");
        int coloumn=sc.nextInt();
        int[][] array= new int[row][coloumn];
        // input 
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose of a matrix is ");


        for(int j=0;j<coloumn;j++){
            for(int i=0;i<row;i++){
                System.out.println(array[i][j]+" ");
            }
            System.out.println();
}
    }}