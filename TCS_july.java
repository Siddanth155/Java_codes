import java.util.*;
import java.io.*;


// always shuffles 3 times between any two given in 2d-array..N is integer given 
public class TCS_july{
    public static void main(String args[]){
        int[][] array=new int[3][2];
        int N,in,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:  ");
        N=sc.nextInt();
        in=N;
        System.out.println("Enter the array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                array[i][j]=sc.nextInt();
            }
        }
        if(N>3 || N<0){
            System.out.println("The dice is in : "+N);
        }else{
            for(int i=0;i<3;i++){// 0, 1, 2..
                for(int j=0;j<2;j++){// 0,1..
                  if(j<1){
                    if(in==array[i][j])
                   {
                    in=array[i][j+1];
                    temp=array[i][j];
                    array[i][j]=array[i][j+1];
                    array[i][j+1]=temp;
                   }else if(in==array[i][j+1]){
                    in=array[i][j];
                    temp=array[i][j];
                    array[i][j]=array[i][j+1];
                    array[i][j+1]=temp;
                   } }
                }
            }  
            System.out.println("its in the "+in+" glass position");
            System.out.println("array after swap is : ");
            System.out.print("{");
            for(int i=0;i<3;i++){
                System.out.print("{");
                for(int j=0;j<2;j++){
                    System.out.print(" "+array[i][j]+" ");
                }
                System.out.print("}");
            }  
            System.out.print("}");   

        }

    }
}
