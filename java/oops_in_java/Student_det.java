public class Student_det{
    String Name="AAADI";
    int Age;
    Student_det(String Name,int Ageee){
        this.Name=Name;
        this.Age=Ageee;


    }
    public void intro(){
        System.out.println("MY NAME IS "+Name+"  MY AGE IS "+Age);
    }
    public void sayhi(String Name){
        System.out.println(this.Name+"  Say hi  "+Name);
    }
    // this key word refers to the current object in a method or construsctor 
    // Constructor is a specail method that is used to insilise methods;
    // constructor is called when 
    // constructor must match the class name 
    // it cannot have a return type like void 
    // we can make multiple constructor in a single class

}