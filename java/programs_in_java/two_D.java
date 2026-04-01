import java.util.*;
public class two_D{
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
        //output
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<coloumn;j++){
        //         System.out.print(array[i][j]);
        //     }
        //     System.out.println();
// to search for a givin element index
   System.out.println("Enter the elemennt you have to search ");
   int x=sc.nextInt();


   
   for(int i=0;i<row;i++){
        for(int j=0;j<coloumn;j++){
           if(array[i][j]==x){
            System.out.println("the row is "+(i)+"the coloumn is"+(j));
           }
        }
    }








        }
    }
    

