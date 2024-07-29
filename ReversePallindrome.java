import java.util.*;
import java.io.*;


public class ReversePallindrome {
    static void pallindrome(String st){
        String pst=new String();
        for(int i=0;i<st.length();i++)
        {
            pst+=st.charAt(st.length()-i-1);
        }
        System.out.println(pst);
        if(st.equals(pst))
        {
            System.out.println("Strings are pallindrome");
        }else
        {
            System.out.println("Strings are not pallindrome");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter string to check pallindrome:");
        String s=sc.nextLine();
        System.out.println();
        pallindrome(s);

    }
}
