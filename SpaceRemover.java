import java.util.Scanner;

public class SpaceRemover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter String to remove Spaces:");
        String st=new String();
        st=sc.nextLine();
        st=st.replace(" ", "");
        System.out.println(st);
    }
}
