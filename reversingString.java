import java.util.Scanner;
import java.io.*;
import java.util.*;
public class reversingString {
    public static void reversed(String b){
        String s=new String();
        for(int i=0;i<b.length();i++){
            s+=b.charAt(b.length()-1-i);
        }
        System.out.println(s);
    }
    public static void intreverse(int b){
        int c=0,d=0;
        for(int i=0;b!=0;i++){
            c=c*10+b%10;
            b=b/10;
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string to be reversed: ");
        a=sc.next();
        reversed(a);
        System.out.print("reverse a number : ");
        int b=sc.nextInt();
        intreverse(b);
    }
}
