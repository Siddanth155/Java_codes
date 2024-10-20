import java.util.Scanner;

public class Bob_React{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Number of Students
        int[] a=new int[n]; //Enter the Student id
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int f=sc.nextInt(); // Number of Friendship
        int[][] fs=new int[f][2];

        for(int j=0;j<f;j++){   //Enter the freinds id
            fs[j][0]=sc.nextInt();
            fs[j][1]=sc.nextInt();
            
        }

        int count=0,flag=0;

        for(int l=0;l<n;l++){
            for(int k=0;k<f;k++){
                for(int i=0;i<2;i++){
                    if(a[l] == fs[k][i]){
                        flag=1;
                    }
                }
            }
            if(flag != 1){
                count++;
            }flag=0;
        }
        System.out.println("Number of Times he has to Teach: "+(count+1));
    }
}