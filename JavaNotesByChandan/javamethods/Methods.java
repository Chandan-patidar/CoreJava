package JavaNotesByChandan.javamethods;
/*
# methods
:-A method  is a block of code which ony runs when it is called
:- You can pass data, known as parameters , into a method
:- method are used to perform certain action ,and they are also known as Function
:- why use method ? => to reuse code :define the code once ,use it many times


# Create a method / Method Declaration
:- A method must be declared within class. it is defined with the name of method ,followed by parentheses().
:- java provide some pre-define method, such as System.out.println(), but you can create your owen method to perform

Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:

Public: The method is accessible by all classes when we use public specifier in our application.
Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.
Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.
Return Type: Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.

Method Name: It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.

Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.

Method Body: It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces.


:- certain action:

// Create a method inside Main:
public class main(){
    Static void myMethod(){
    // code to be executed
    }
}
//Example explain

:- myMethod() is the name of the method
:- static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
:- void means that this method does not have a return value. You will learn more about return values later in this chapter

# Types of Method

There are two types of methods in Java:

 * Predefined Method
 * User-defined Method

*/


// # call the method
public class Methods {
    static void myMethod() {
        System.out.println("I have learn how to execute the method in java ");
    }

    public static void main(String[] args){
        myMethod();
        // A method can also be called multiple times:
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}
// main(String[] args)




