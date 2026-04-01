public class find_second_largest_element {
    public static void main(String[] args) {
        int[] array={2,3,4,4,5,5,5,4,4,4,45,5,5,56,99};
        int max=array[0];
        int sec_max=array[1];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                int temp=max;
                max=array[i];
                sec_max=temp;

            }
        }
        System.out.println(sec_max);
    }
    
}
