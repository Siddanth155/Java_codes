import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key=sc.nextInt();
        linear(arr,key,size);

    }
    private static void linear(int[] a,int k,int s){
        int flag=-1;
        for(int i=0;i<s;i++){
            if(a[i]==k){
                flag=i;
                break;
            }
        }
        if(flag>=0){
            System.out.println("Element found at position "+flag);
        }else{
            System.out.println("Element not found...");
        }
    }
}
