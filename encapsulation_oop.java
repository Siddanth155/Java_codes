import java.io.*;
import java.util.*;
class user{                 //access modifiers and encapsulation(getter and setter method)
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        setPassword("randomPass");
        return this.password;
        
    }
    private void setPassword(String pass){
        this.password=pass;
    }
}
public class encapsulation_oop {
    public static void main(String[] args) {
      user a=new user();
      a.name="arun";
      a.email="sidd@email.com";
      System.out.println(a.getPassword());

    }
}
