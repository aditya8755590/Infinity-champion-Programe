import java.util.Scanner;

public class metrix_sprial_order_print {
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
        int row_start=0;
        int row_end=row-1;
        int coloumn_start=0;
        int coloumn_end=row-1;
        while(row_start<=row_end && coloumn_start<=coloumn_end){


                for(int col=coloumn_start;col<=coloumn_end;col++){
                    System.out.print(array[row_start][col]+",");

                }
                row_start++;
                for(int roww=row_start;roww<=row_end;roww++){
                    System.out.print(array[roww][coloumn_end]+",");

                }
                coloumn_end--;
                for(int col=coloumn_end;col>=coloumn_start;col--){
                    System.out.print(array[row_end][col]+",");

                }
                row_end--;
                for(int roww=row_end;roww>=row_start;roww--){
                    System.out.print(array[roww][coloumn_start]+",");

                }
                coloumn_start++;








        }






    




    }




}
