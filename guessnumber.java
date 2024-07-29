import java.util.*;
import java.io.*;

public class guessnumber {
    public static void main(String[] args) {
        int number,r;
        char s;
        Random rand=new Random();
        r=rand.nextInt(100);
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Guess number between 1 to 100: ");
            number=sc.nextInt();
            while (true) {
                if(number==r)
                {
                    System.out.println("Correct");
                    break;
                }else if(number>r){
                    System.out.println("try lesser number: ");
                    number=sc.nextInt();
                }else if(number<r){
                    System.out.println("try greater number: ");
                    number=sc.nextInt();
                }else if(number<0 || number>100){
                    System.out.println("retry");
                    break;
                }                
            }
            System.out.println("try again y/n");
            s=sc.next().charAt(0);
        }while(s =='y');
    }
}
