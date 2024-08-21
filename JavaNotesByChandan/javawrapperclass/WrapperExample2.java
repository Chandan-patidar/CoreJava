package CoreJava.JavaNotesByChandan.javawrapperclass;
//Java program to convert object into primitives
//Unboxing example of Integer to int
public class WrapperExample2 {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue();//converting Integer to int explicitly
        int j = a;//
        System.out.println(a+" "+i+" "+j);
    }
}
