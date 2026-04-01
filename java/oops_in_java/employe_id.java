public class employe_id {
    String name;
    String last_name;
    String department;
    int rendom_num;
    char fist,last;
    int x,two_numbers_at_last;
    
    employe_id(String department,String name,String last_name,int rendom_num,int x){
        this.name=name;
        this.last_name=last_name;
        this.department=department;
        this.rendom_num=rendom_num;
        this.x=x;

    }
    public String Id_of_empolye(){
        if(name.length()>last_name.length()){
            fist = name.charAt(name.length()-1);
            last=last_name.charAt(0);

        }
        else{
            fist= last_name.charAt(last_name.length()-1);
            last=name.charAt(0);
           
        
        }
        String last_dig =String.valueOf(last_ke_digits(rendom_num,x));
        String Final_id_is_equal=last+department+fist+last_dig;




        return Final_id_is_equal;

        }
    public int last_ke_digits(int rendom_num,int x){
        int size=0;
        int last_digit;
        int copy_of_rendom_num=rendom_num;
        while(rendom_num>0){
            rendom_num=rendom_num/10;
            size++;

        }
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            last_digit=copy_of_rendom_num%10;
            copy_of_rendom_num=copy_of_rendom_num/10;
            array[i]=last_digit;
        }
        for(int i=0;i<size/2;i++){
            int temp=array[i];
             array[i]=array[size-i-1];
             array[size-i-1]=temp;
        }

        two_numbers_at_last=array[x]*10+array[x+1];


        return two_numbers_at_last;
        
        

    }
    //Implement the method `String generateEmployeeID(String department, String firstName, String
   //lastName, int randomNumber, int x)` to accomplish this.


   //First letter of ShorterString + Entire Department + Last letter of LongerString +
   //RandomNumber digits at positions X and X+1.
    
}
