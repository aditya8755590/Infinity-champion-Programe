import java.util.*;;
public class print_nth_fabonaci_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int position=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int count=2;
        if(position==1){
            System.out.println(a);
        }
        else if (position==2) {
            System.out.println(b);
            
        } else{
        while(count!=position){
           c=b;
           b=a+b;
           a=c;
          
          count++;
        }
        System.out.println(b);
    }
}

    
}
