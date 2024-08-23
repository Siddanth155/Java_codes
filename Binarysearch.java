import java.util.*;
class BinarySearch1{
    public void binary_search(int[] a,int size,int k){
        int first=0;
        int last=size-1;
        int mid=(first+last)/2;
        int pos=-1;
        while(first<last){
            mid=(first+last)/2;
            if(a[mid]==k){
                pos=mid;
                break;
            }
            if(a[mid]>k){
                last=mid-1;
            }
            if(a[mid]<k){
                first=mid+1;
            }
        }
        if(pos>=0){
            System.out.println("Found in position: "+(pos+1));
        }else{
            System.out.println("Not There............");
        }
    }
}

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the Array : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.print("Please give key: ");
        int key=sc.nextInt();
        BinarySearch1 bs=new BinarySearch1();
        bs.binary_search(a, n, key);
    }
}
