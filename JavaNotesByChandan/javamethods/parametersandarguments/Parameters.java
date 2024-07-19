package JavaNotesByChandan.javamethods.parametersandarguments;
/*
# Parameters and Arguments
:- information can be passed to method as a parameter. Parameter acts as  Variable inside the method

:-Parameters are specified after the method that name ,inside the parentheses. you can add  as parameters as you want ,just
separate them with comma,

 */
// Q1 The following example has a method that takes a String called fname as parameter. When the method
// is called, we pass along a first name, which is used inside the method to print the full name:
public class Parameters {
    /*public static void main(String[] args) {
    //Multiple Parameters
        myMethod("shubham",  23);
        myMethod("kamlesh", 45);
        myMethod("chandan",25);
    }

     static void myMethod(String fname, int age) {
        System.out.println(fname + " patidar is " + age);
    }

     */
    // # It is common to use if...else statements inside methods:
    // Create a checkAge() method with an integer Variable called Age
    static void checkAge(int age ){
        if(age < 18){
            System.out.println("Acess denied - you are not old enough !");
        }else{
            System.out.println("you are old enough");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }

}
