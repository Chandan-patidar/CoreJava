package JavaNotesByChandan.javamethodsoverloading;
/*
# Method Overloading
:- with method overloading , multiple method can have the same name with different parameters:
 Example :-
 int method (int x)
 int method (Float x)
 int method (double x , double y)
 */
public class methodoverloading {
    private static double x;
//Consider the following example, which has two methods that add numbers of different type:

    static int plusMethodInt(int x ,int y){
        return x + y;
    }
    static double plusMethodDouble(double x ,double y){
        return x + y;
    }
    /*
    Instead of defining two methods that should do the same thing, it is better to overload one.

     In the example below, we overload the plusMethod method to work for both int and double:



     static int plusMethod(int x ,int y){
        return x + y;
    }
    static double plusMethod(double x ,double y){
        return x + y;
    }
     */
    public static void main(String[] args){
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDouble(4.3 ,6.43);
        System.out.println("int :" + myNum1);
        System.out.println("double :" + myNum2);
    }
}

