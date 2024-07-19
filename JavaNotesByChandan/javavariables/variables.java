package JavaNotesByChandan.javavariables;
// #javavariables
//Declaring (Creating) Variables

//Create a variable called name of type String and assign it the value "chandan":
public class variables {
    public static void main(String[] args){
        String name = "chandan ";
        System.out.println(name);

        // Create a variable called myNum of type int and assign it the value 15:

         int myNum=15 ;

        //Change the value of myNum from 15 to 20:

         myNum=20;
         System.out.println(myNum);

         //A demonstration of how to declare variables of other types:

        float myFloatNum = 5.00f;
        char myletter = 'c';
        boolean myBol= true;
        String myText = "Hello";
        System.out.println(myFloatNum);
        System.out.println(myletter);
        System.out.println(myBol);
        System.out.println(myText);
        //To combine both text and a variable, use the + character
        System.out.println("Hello " + name);

        String firstname = "chandan ";
        String secondname = "patidar";
        String fullName = firstname + secondname;
        System.out.println( fullName );

    // # Multiple variable
        // To declare more than one variable of the same type, you can use a comma-separated list:
        int x=10;
        int y= 70;
        int z=45;
        System.out.println(x+y+z);
        /* You can simply write:
        int x=34,y=3,z=9;
        System.out.println(x+y+z); */

        // One Value to Multiple Variables
        x=y=z=50;
        System.out.println(x+y+z);

    // # Java Identifiers


    }








}
