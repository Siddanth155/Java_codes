import java.util.*;
import java.io.*;
// count vowesl , consonants and blank spaces....of given line string..

public class CountVowel {
    static void Count(String st){
        char[] Vowel={'a','e','i','o','u','A','E','I','O','U'};
        int v=0,c=0,s=0,flag=0;
        for(int i=0;i<st.length();i++){
            for(char m:Vowel){
                if(m==st.charAt(i)){
                    v+=1;
                    flag=1;
                    break;
                }  
            }
            if(flag!=1 && st.charAt(i)!=' '){
                c+=1;
            }
            if(st.charAt(i)==' '){
                s+=1;
            }
            flag=0;
        } 
        System.out.println("Number of Vowels = "+v+" ::Number of Consonants = "+c+" ::Number of Spaces = "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the String to Count the Vowel, Consonant, and Spaces :: ");
        String n=sc.nextLine();
        Count(n);
    }
}
