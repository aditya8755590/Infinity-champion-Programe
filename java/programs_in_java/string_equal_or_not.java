import java.util.Scanner;
public class string_equal_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Str1=sc.nextLine();
        String Str2=sc.nextLine();
        // int count=0;
        // for(int i=0;i<Str1.length();i++){
        //     if(Str1.charAt(i)==Str2.charAt(i)){
        //         count++;
        //     }


            
        //     }
        
        // if(count==Str1.length()){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        System.out.println(equal(Str1, Str2));

        public static boolean equal(String S1,String S2) {
            if(S1==S2){
                return true;
            }
            if(S1.length()!=S2.length()){
                return false;
            }
            for (int i = 0; i < S1.length(); i++) {
                if(S1.charAt(i)!=S2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        

    }
    
    //another method of doing this type of code lack

    public static equal(String S1,String S2) {
        if(S1==S2){
            return true;
        }
        if(S1.length()!=S2.length()){
            return false;
        }
        for (int i = 0; i < S1.length(); i++) {
            if(S1.charAt(i)!=S2.charAt(i)){
                return false;
            }
        }
        return true;
}
}
