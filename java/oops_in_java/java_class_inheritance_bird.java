class animal {
    public void eat(){
        System.out.println("Eat in class animal ");

    }
    public void sleep(){
        System.out.println("Sleep in class animal ");
    }
    
}
class bird extends animal{
    public void eat(){
        System.out.println("Eat in class bird ");

    }
    public void sleep(){
        System.out.println("Sleep in class bird  ");
    }
    public void fly(){
        System.out.println("GOd of evil fly in bird ");
    }
}
public class java_class_inheritance_bird{
    public static void main(String[] args) {
        animal obj=new bird();
      obj.eat();
      obj.sleep();
      bird obj2=new bird();
      obj2.eat();
      obj2.sleep();
      obj2.fly();

      


    }
    
}
