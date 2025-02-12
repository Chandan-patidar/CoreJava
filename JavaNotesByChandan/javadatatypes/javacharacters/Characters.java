package JavaNotesByChandan.javadatatypes.javacharacters;
// # Java Characters :-The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

public class Characters {
    public static void main(String[] args){
        char myGrade ='B';
        System.out.println(myGrade);

    //  ASCII values, display certain characters:-

        char myVar1=65 ,myVar2=66,myVar3=67,myVar4=68;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar4);

// # Strings
        
        String Greeting ="Hello world";
        System.out.println(Greeting);

        //Here's a real-life :-  Example of using different data types, to calculate and output the total cost of a number of items:

        // Create variables of different data types
        int item=50;
        float costPerItem= 9.990f;
        float totalCOst= item * costPerItem;
        char currency = '$';

        // Print variable

        System.out.println("Number of iteams " +item);
        System.out.println("Cost per itesm " + costPerItem + currency);
        System.out.println("Total cost " +totalCOst + currency);



    }

}
