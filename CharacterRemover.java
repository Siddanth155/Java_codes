import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter string for removing characters:");//only alphabets allowed...
        String str=new String();
        str=sc.nextLine();
        String st=new String();
        for(char s:str.toCharArray()){
            if(Character.isAlphabetic(s)||Character.isWhitespace(s)){
                st+=s;
            }
        }
        System.out.println();
        System.out.println(st);
    }
}
