package JavaNotesByChandan.string;
// #n String are used to storing text
// A String variable contains a collection of characters surrounded by double quotes:

public class Length {
    public static void main(String[] args){
        // String

        String greeting = " Welcome";
        System.out.println(greeting);
        // Length
        String text = "JNNKkjnnKJNkjnKNnjunojNOJNljnLJN";
        System.out.println("The Length of the given String "+text.length());

        // more String methods
        //example toUpperCase() and toLowerCase():
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // # finding a character in a String
        // The indexOf() method return the index(the position) of the first occurrences of specified text in a String(including whiter spaces);

        String txt = "The shorter way to do many things is to only do one thing at a time.";

        System.out.println(txt.indexOf("to"));


        // Java String hashCode() Method


        String myStr="hello";;
        System.out.println(myStr.hashCode());

        //#Java String Concatenation
        //  :- The + operator can be used between string to combine them. This is called concatenation\

        String firstName = "Chandan";
        String lastName = "Patidar";
        System.out.println(firstName+" "+ lastName);

        //you can also use the concat() method to concatenate two String

        String fName = "Shubham ";
        System.out.println(fName.concat(lastName));

    // # Java Name and Sting
       int x = 10;
       int y = 20;
       System.out.println(x+y);

    //   add two strings, the result will be a string concatenation:

        String a = "10";
        String b = "20";
        String c = a+b;
        System.out.println(c);

    // add a number and String

        String s = "40";
        int d = 90;
        System.out.println(s+y);

    // # String special characters
        /*
        The  backslash (/) escape character turns special character into String character

       escape character                 Result                        Description
        \'                                  '                           single quote
        \"                                  "                           Double quote
        \\                                  \                            Backslash

        Sequence \" inserts a double  quote in  a String
       */
        String extract = "we are the so-called \"vikings\"  from the  north  ";
        System.out.println(extract);


        // the sequence \' insert a single quote in string

        String line = "It/'s alright.";
        System.out.println(line);

        // the sequence \\ insert a single  backlash in String :

        String writing = "The character \\ is called backlash .";
        System.out.println(writing);

    /*  Code	Result	Try it
        \n	New Line
        \r	Carriage Return
        \t	Tab
        \b	Backspace
         \f	Form Feed
    */




    }
}
