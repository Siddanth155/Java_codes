public class StringType2 {//Non constant pool
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("java");
        String s3=new String("Python");
        String s4=new String("Python");
        String s5=new String("java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s2==s5);
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s4==s5);
    }
}
