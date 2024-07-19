package JavaNotesByChandan.javamethods.parametersandarguments.returnvalues;

public class returnvalues {
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method:
    static int myMethod(int x, int y) //his example returns the sum of a method's two parameters:
    {
        return x + y ;
    }
    public static void main(String[] args){
        int z = myMethod(9,3);
        System.out.println(z);
    }
}
