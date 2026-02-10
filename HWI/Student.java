package HWI;
import java.util.ArrayList;
class Student {
    int id;
    String name;
    double marks;
    public Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(01,"Aditya",345));
        students.add(new Student(02,"Aditya2",500));
        students.add(new Student(03,"Aditya3",600));
        students.add(new Student(04,"Aditya4",700));
        students.add(new Student(05,"Aditya5",800));
        System.out.print(avg(students));
        // find the top score student 
        System.out.println(top(students));




    }
    private static  double avg(ArrayList<Student> students){
          double sum=0;
          for(Student s:students){
            sum+=s.marks;
          }
          return sum/students.size();
    }
    public static Student top(ArrayList<Student> students){
        int top=0;
        Student s=students.get(0);
        for(int i=1;i<students.size();i++){
            if(students.get(i).marks>s.marks){
                s=students.get(i);
                top=i;
            }
        }
        return s;
    }

     @Override
        public String toString(){

            return "ye hai honar baccha " + this.name +" ye marks hai "+this.marks;
        }


}
