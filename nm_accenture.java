import java.util.Scanner;
import java.util.Stack;

public class nm_accenture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("enter N : ");
        n=sc.nextInt();
        System.out.print("enter M : ");
        m=sc.nextInt();
        Stack<Integer> d=new Stack<>();
        Stack<Integer> dn=new Stack<>();

        for(int i=1;i<=m;i++){
            if(i%n==0){
                d.push(i);
            }else{
                dn.push(i);
            }
        }
        int t1=0,t2=0;
        while (!d.isEmpty()) {
            t1+=d.pop();
        }
        while (!dn.isEmpty()) {
            t2+=dn.pop();
        }
        int result=Math.abs(t1-t2);
        System.out.println("The Divisible: "+t1);
        System.out.println("The Not Divisible: "+t2);
        System.out.println("The difference is: "+result);
    }
}
