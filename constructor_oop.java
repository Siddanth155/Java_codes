
class Student{
    String name_class;
    int age_class;
    public void print(){
        System.out.print(this.name_class);
        System.out.print(" "+this.age_class);
    }
    Student(Student s2){//copy constructor and also given parameter and has no return type
        this.age_class=s2.age_class;
        this.name_class=s2.name_class;   
    }
    Student(){// has no parameter no return type

    }
}
public class constructor_oop {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age_class=10;
        s1.name_class="arun";
        s1.print();
        Student s2=new Student(s1);
        s2.print();
    }
    
}
