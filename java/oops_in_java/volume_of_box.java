public class volume_of_box {
    public static void main(String[] args) throws Exception {
        Box v1=new Box(12,2,3);
        Box v2=new Box(12223,2.93,33);
        // yaha pe v1.setlen mai sirf width ko hi dhekaga 
        v1.setlen(-5);


        
          
           System.out.println(v1.volume());
           System.out.println(v2.volume());
           System.out.println(v1.getlen());
          

    
    }
}
