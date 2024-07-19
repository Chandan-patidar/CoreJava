package JavaNotesByChandan.javaconditionsandIfstatements;

public class Ifstatement {
    public static void main(String[] args){
        /* # if statement  :- to specify  block a block of java code to be executed if the condition  is true
         Syntax :-
         if (condition){
           // block of code to be executed if the condition is true
         }
         */

        // Test two values to find out if 20 is greater than 18. If the condition is true, print some text ;

       // int x =20;
        //int y= 18;
        if (20>18){
            System.out.println("20 greater than 18");
        }

        int x =20;
        int y= 18;
        if (x>y){
            System.out.println("20 greater than 18 ");
        }
        /*
        // # else statement  :- to specify   block of java code to be executed if the condition  is false
        // Syntax:-

        if (condition) {
            // block of code to be executed if the condition is true
        }else{
         // block of code to be executed if the condition is false
        }

         */

        int time = 20 ;
        if (time <18){
            System.out.println("Good days");
        }else{
            System.out.println("Good evening ");
        }

          /*
          // #  else if  statement :- to specify  a new condition if the first condition is false
          // Syntax :-

          if (condition 1 x){
                 // Block of code to be executed if condition 1   is  true
          }else if ( condition 2 x is divisible by 5 ){
                 // Block of code to be executed if condition 1 and condition 2 is true
          }else{
                 //  Block of code  to be executed if condition 1 false and condition 2 ia false
          }
            */
        int t=22;
        if (t<10){
            System.out.println("Good morning  Dear .");
        }else if (t<18){
            System.out.println(" good day ");
        }else{
            System.out.println("Good evening");
        }

        /*
          // # Short Hand if... else is also Known as ternary operator because is it consist of three operator

          // Syntax :-

           variable = (condition)? ExpressionTrue ": expressionFalse;
           */
        //Instead of writing:
        if (time < 18){
            System.out.println("Good  day");
        }else{
            System.out.println("Good evening");
        }

        // You can simply write:

        String result=(time< 18)? "Good day.": "Good evening.";
        System.out.println(result);






























    }
}
