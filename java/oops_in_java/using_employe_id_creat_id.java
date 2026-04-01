import java.util.*;
public class using_employe_id_creat_id {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("EnTER NAME");
        // String name=sc.nextLine();
        // System.out.println("ENTER LAST NAME ");
        // String last_name=sc.nextLine();
        // System.out.println("ENTER DEPARTMENT");
        // String department=sc.nextLine();
        // System.out.println("ENTER RENDOM NUM");
        // int rendom_num=sc.nextInt();
        // System.out.println("ENTER THE POSITION OF RENDOM NUMBER ");
        // int x=sc.nextInt();
     // employe_id E1=new employe_id(name, last_name, department, rendom_num, x);
      employe_id E2=new employe_id("HR","JOHN","SMITH",62789,2);
      employe_id E1=new employe_id("FINANCE","ANNA","TAYLOR",987654,2);

      System.out.println("YOUR ID IS   ");
   //   System.out.println(E1.Id_of_empolye());
      System.out.println(E2.Id_of_empolye());
      System.out.println(E1.Id_of_empolye());

        
    }
    
}
