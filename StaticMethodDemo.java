import java.io.*;
class Student{
    int rollno;
    String name;
    static String college="SITE";
    static void changes(){
        college="SASI";
    }
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
    public class StaticMethodDemo{
        public static void main(String[] args){
            Student s1=new Student(512,"SASI");
            Student.changes();
            Student s2=new Student(552,"SITA");
            System.out.println("The student details are ");
            s1.display();
            s2.display();
            
        }
    }
