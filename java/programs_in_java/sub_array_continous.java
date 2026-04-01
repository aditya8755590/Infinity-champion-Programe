public class sub_array_continous {
    public static void main(String[] args) {
       int array1[]={1,2,3,4};
       int max;
       for(int i=0;i<array1.length;i++){
        for(int j=i;j<array1.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(array1[k]+"");

            }
            System.out.println();
        }
       }
    }
    
}
