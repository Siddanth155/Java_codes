import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter formula with ()( :");
        String str,st=new String();
        str=sc.nextLine();
        for(char s:str.toCharArray()){
            if(s=='('||s==')'){
                continue;
            }else{
                st+=s;
            }
        }
        System.out.println(st);
    }
}
