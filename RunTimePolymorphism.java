

class animal{
    void walk(){
        System.out.println("Animal Walks (Super,parent Class)");
    }
}
class cheetha extends animal{
    
    void walk(){
        System.out.println("Cheetha runs (Child Class)");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        cheetha c=new cheetha();
        c.walk();
        animal a=new animal();
        a.walk();
    }
}
