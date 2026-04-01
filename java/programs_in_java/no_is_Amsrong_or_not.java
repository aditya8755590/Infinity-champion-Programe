public class no_is_Amsrong_or_not {
    public static void main(String[] args) {
       int  input1=153;
        int sum1=0;
     int no_of_digits=0;
     int input2=input1;
     int input3=input1;
     int digit;

     while(input1>0){
         input1=input1/10;
         no_of_digits++;

     }
     while(input2>0){
         digit=input2%10;
         input2=input2/10;
         sum1=sum1+(int)Math.pow(digit,no_of_digits);

     }
     if(sum1==input3){
        System.out.println("it is a amstrong no.");
     }
     else{
        System.out.println("it is not a amstrong no");
     }


    }
    
}
