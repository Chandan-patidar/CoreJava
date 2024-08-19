package JavaNotesByChandan.userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // create scanner object
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username ");
        userName = myObj.nextLine(); // Read user input
        System.out.println("Username is : " + userName ); //Output user input
    }
}

