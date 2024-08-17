class StringDemoIMP{//constant pool Type1...
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3="Python";
        String s4="Python";
        String s5="java";
        System.out.println(s1==s2);//java==200...then s1=s2=200th memory
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