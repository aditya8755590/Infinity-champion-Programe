public class Box {
    private double width;
    double depth;
    double height=21;

    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double volume(){
        double vol=width*height*depth;
        return vol;
        

    }
    // Sabe Se Phele static hi chalaga puri class 
    static{
        System.out.println("YOU ARE TRYING TO FIND THE VOLUME ");
    }
    public void setlen(double width) throws Exception{
        // handel exception
        try{
        if(width<=0){
            throw new Exception("-ve nahi hota ");
        }
        this.width=width;
    }
        catch(Exception e){
            e.printStackTrace();

           }
}
    public double getlen(){
        return width;
    }
    
}
