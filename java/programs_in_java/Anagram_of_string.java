import java.util.*;
public class Anagram_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        char[] array1=new char[str1.length()];
        char[] array2=new char[str2.length()];
        int count=0;
        for(int i=0;i<str1.length();i++){
            array1[i]=str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            array2[i]=str2.charAt(i);
        }

for(int i=0;i<str1.length();i++){
    if(str1.length()!=str2.length()){
        System.out.println("No");
        break;
    }
    int count1=0;
    int count2=0;
    for(int j=0;j<str1.length();j++){
        
        if(array1[i]==array1[j]){
            count1++;
            
        }
    }
    for(int j=0;j<str1.length();j++){
        
        if(array2[i]==array2[j]){
            count2++;
            
        }
    }
    if(count1==count2){
        count++;
    }

}
if(count==array1.length){
    System.out.println("yes");

}
else{
    System.out.println("no");
}

        
    }
    
}......
