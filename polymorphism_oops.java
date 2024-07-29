import java.util.*;
import java.io.*;
class Student{//polymorphism
    
    String name;
    int age;
    public void info(int age){
        System.out.println(this.age);
    }
    public void info(String name){
        System.out.println(this.name);
    }
    public void info(int age, String name){
        System.out.println("age and name is: "+this.age+" and "+this.name);
    }
}
public class polymorphism_oops {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="siddanth";
        s1.age=21;
        s1.info(s1.age,s1.name);
    }
}
