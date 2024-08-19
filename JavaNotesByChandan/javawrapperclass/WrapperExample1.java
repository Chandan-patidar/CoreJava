package JavaNotesByChandan.javawrapperclass;

//Wrapper class Example: Primitive to Wrapper
//Autoboxing example of int to Integer

public class WrapperExample1 {
    public static void main(String[] args ){
        // converting int into integer
        int a= 20;
        Integer i = Integer.valueOf(a); //Converting int into integer explicitly
        Integer j = a; //  autoboxing ,  now compiler will  write  Integer.valueOf(a) internally
        System.out.println(a+ " "+i+" "+j);
    }
}
