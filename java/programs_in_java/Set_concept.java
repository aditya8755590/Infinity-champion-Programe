import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_concept {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();  
        Set<Integer> s2=new LinkedHashSet<>();    
        Set<Integer> s3=new TreeSet<>();   
        s1.add(4); 
        s1.add(3); 
        s1.add(6); 
        //
        s2.add(4); 
        s2.add(3); 
        s2.add(6); 
        //
        s3.add(4); 
        s3.add(3); 
        s3.add(6); 
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        //# remove all duplicat enement from array
        Set<Integer> s4=new TreeSet<>();  
int[] array={2,2,2,2,2,24,4,5,5,4,3,4,5,5,6,6,7,7,7,8,8,9,7,6,55,4,3,3};
for(int i=0;i<array.length;i++){
s4.add(array[i]);

}
System.out.println(s4);




  }
    
}
