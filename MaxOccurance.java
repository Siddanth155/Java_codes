import java.util.*;

public class MaxOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
        int max=0,element=0,count=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                element=a[i];
            }
        }
        System.out.println("The element "+element+" occured maximum time ,That is "+max+" Times....");
    }
}
