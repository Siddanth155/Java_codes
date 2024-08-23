import java.util.*;

public class wiproString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        char ch;


        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<str[i].length();j++){
                ch=str[i].charAt(j);
                if(Character.isUpperCase(ch)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
