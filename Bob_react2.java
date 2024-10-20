import java.util.*;


public class Bob_react2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of students");
        System.out.println();
        int n=sc.nextInt(); //number of students
        System.out.println("Students Id's");
        System.out.println();
        int[] a=new int[n]; //student ID
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println("Number of Friends");
        System.out.println();
        int m=sc.nextInt(); //Number of Friends
        System.out.println("friends ");
        System.out.println();
        int[][] fg=new int[m][2];
        for(int j=0;j<m;j++){
            fg[j][0]=sc.nextInt();
            fg[j][1]=sc.nextInt();
        }
        System.out.println("Teaching Number of people");
        System.out.println();
        int t=sc.nextInt();// Number of people he teaches
        System.out.println("Teaching people id,s");
        System.out.println();
        int[] tg=new int[t];
        for(int i=0;i<t;i++){
            tg[i]=sc.nextInt();
        }
        // (n,a)(m,fg)(t,tg)
        // Time required to teach all
        ArrayList<Integer> al=new ArrayList<>();
        for(int z=0;z<t;z++){
            al.add(tg[z]);
        }
        System.out.println("Array List:"+al);
        int counter=0;
        for(int y=0;y<m;y++){
                if(al.contains(fg[y][0])){
                    if(!al.contains(fg[y][1])){
                        al.add(fg[y][1]);
                        System.out.println("Executed 1st block for (Does not contain): "+fg[y][1] );
                        System.out.println(al);
                        counter++;
                    }
                }else if(al.contains(fg[y][1])){
                    if(!al.contains(fg[y][0])){
                        al.add(fg[y][0]);
                        System.out.println("Executed 2nd block for (Does not contain)"+fg[y][0] );
                        System.out.println(al);
                        counter++;
                    }
                }
        }
        for(int l=0;l<n;l++){
            if(!al.contains(a[l])){
                al.add(a[l]);
                counter++;
            }
        }
        System.out.println("Array List Again:"+al);
        System.out.println("The Hours required: "+counter);

    }
}
