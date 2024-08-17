import java.util.*;
import java.io.*;
// n number of socks with array of n size and color denoted by numbers
public class wipro1socks {
    public static void main( String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter value of N : ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter values in array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,skip=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }  
            skip+=(count/2);
            i+=count;
            count=0;
        }
        System.out.println(skip);
    }
}
