import java.util.*;
class ArrayOperations{

    Scanner sc=new Scanner(System.in);
    int arr[],n;

    public void createArray(){
        System.out.println("enter the array size:");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("array created");
        System.out.println();

        System.out.println("-----------------------------------------------------");


    }

    public void addData(){
        System.out.println("enter array data: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter the data at "+(i+1)+" position: ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

    }

    public void deleteData(){
        System.out.println("please enter the position of deletion:");
        int pos=sc.nextInt();
        if(pos<n){
        for(int i=0;i<n-1;i++){
            if(pos<=i)
            {
                arr[i]=arr[i+1];
            }
        }
        n=n-1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }}else{
            System.out.println("invalid position: ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");
    }

    public void updateData(){
        System.out.println("enter the position to add data: ");
        int pos=sc.nextInt();
        System.out.println("enter the data: ");
        int data=sc.nextInt();
        int []a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        n=n+1;
        arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]= a[i];
        }
        if(pos<n){
            for(int i=(n-1);i>=0;i--){
                if(pos<i){
                    arr[i]=arr[i-1];
                }
            }
            arr[pos]=data;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

        }else{
            System.out.println("invalid position: ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");

    }
    public void display(){
        System.out.println("Displaying : ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

    }

    public void search(){
        System.out.println("enter search position: ");
        int pos=sc.nextInt();
        if(pos<n){
            for(int i=0;i<n;i++){
                if(pos==i){
                    System.out.println("found at position:"+i);
                }
            }
        }else{
            System.out.println("invalid position: ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");
    }
}

public class arrayFunctoins {
    public static void main(String[] args) {
        ArrayOperations a=new ArrayOperations();
        a.createArray();
        a.addData();
        a.deleteData();
        a.updateData();
        a.display();
        a.search();

    }
}
