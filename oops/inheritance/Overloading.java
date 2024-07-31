package oops.inheritance;

// Java Program for Method overloading
// By using Different Types of Arguments

import jdk.dynalink.beans.StaticClass;

import java.security.PublicKey;

// Class 1
// Helper class
class Helper{
    // method with 2 integer parameters
    static int Multiplay(int a ,int b ){

        return a * b;
    }
    // Method 2
    // With same name but with 2 double parameter
    static double Multiplay(double a,double b) {
        return a * b;
    }
}

// Class 2

public class Overloading {
// Main driver method
    public static void main(String[] args){
        //Calling method by passing
        // input as in arguments

        System.out.println(Helper.Multiplay(9,3));
        System.out.println(Helper.Multiplay(5.98,78.9));

    }
}
