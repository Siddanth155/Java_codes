import java.util.*;
import java.io.*;

public class wipro_valley {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Please enter number of steps : ");
       int steps=sc.nextInt();
       System.out.print("Now give a string value only containing {U,D}: ");
       String str=new String();
       str=sc.next();
       int counter1=0,counter2=0;
       int start=0,hill=0,valley=0;
       StringBuilder sb=new StringBuilder();
       if(steps==str.length()){
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='U'){
            counter1++;
        }else if(str.charAt(i)=='D'){
            counter2++;
        }
        sb.append(str.charAt(i));
        if(counter1==counter2){
            if(sb.charAt(start)=='U'){
                hill++;
            }else if(sb.charAt(start)=='D'){
                valley++;
            }
            start=sb.length();
            counter1=0;
            counter2=0;
        }

       }
       System.out.println("The valley count == "+valley+":: The hill count == "+hill);
    }else{
        System.out.println("Guys give string lenght equals to steps");

    }

    }
}
