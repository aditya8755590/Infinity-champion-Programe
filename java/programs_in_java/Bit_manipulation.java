import java.util.*;
public class Bit_manipulation {
    public static void main(String[] args) {
       
        // for chaek the given position bits is 1 or 0
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        // System.out.println("Enter the number you want to check");
        System.out.println("Enter the number you want to change the position ");

        int position=sc.nextInt();
        int bitmask = 1<<position;
            // GET BIT
        // if((bitmask&number) == 0) {
        //     System.out.println("the bit is zero ");

        // }
        // else{
        //     System.out.println("the bit is one");
        // }
        // SET BIT 
        // MATLAB O KO 1 BANA NA HAI 
        // number= (bitmask|number);
        // System.out.println(number);
      // clear bit
      // matlab 1 ko 0 bana na hai 

    //   int notBitMask=~(bitmask);
    //   number= (notBitMask&number);
    //   System.out.println(number);



// update Bit


// kuch bi ho use 1 ya 0 bana dijiye
//so hum is mai clear or set dono ka istmal kar lenge 
// or phele dhek lene ki 1 ahi ya 0 hai 

    }
}
