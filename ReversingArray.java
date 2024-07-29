import java.io.*;
public class ReversingArray {
    public static void reverse(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-1-i];
        }    
        int j=0;
        while(j<arr.length){      
            System.out.print(temp[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
