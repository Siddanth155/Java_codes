public class StringConcept6 {//string concatenation..1)aloocating only string value 2)allocating at least 1 variable.
    public static void main(String[] args) {
        String s1,s2,s3,s4,s5,s6,s7;
        s1="java";//constant pool
        s2="Python";//constant pool
        s3="java"+"python";//constant pool
        s4="java"+"python";//constant pool
        s5=s1+"python";//non-constant pool
        s6="java"+s2;//non-constant pool
        s7=s1+s2;//non-constant pool                     
        System.out.println(s1==s2);//false                  all variables in java stores only data..nothing as address..
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s1==s5);//false
        System.out.println(s1==s6);//false
        System.out.println(s1==s7);//false
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//false
        System.out.println(s2==s5);//false
        System.out.println(s2==s6);//false
        System.out.println(s2==s7);//false
        System.out.println(s3==s4);//True
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s3==s7);//false
        System.out.println(s4==s5);//false
        System.out.println(s4==s6);//false
        System.out.println(s4==s7);//false
        System.out.println(s5==s6);//false
        System.out.println(s5==s7);//false
        System.out.println(s6==s7);//false  
    }
}
