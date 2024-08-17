import java.util.*;
import java.io.*;

public class wiproshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter size of array, and number of rotation : ");
        int n,rotation;
        n=sc.nextInt();
        rotation=sc.nextInt();
        System.out.print("please give the inputs of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp,first;
        for(int j=0;j<rotation;j++){
            first=arr[0];
            for(int k=0;k<n-1;k++){
                arr[k]=arr[k+1];
            }
            arr[n-1]=first;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
