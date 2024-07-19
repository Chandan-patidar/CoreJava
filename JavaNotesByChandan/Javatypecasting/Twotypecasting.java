package JavaNotesByChandan.Javatypecasting;
//  # Type casting :- is when you assign a value of one primitive data type to another type.
// we cant apply casting on Boolean
/*Widening Casting
 Widening casting is done automatically when passing a smaller size type to a larger size type:
 Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

 */

public class Twotypecasting {
    public static void main(String[] args){

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);



/*Narrowing casting :-Must be done Manually by placing the type in parentheses () in the front of value;
Narrowing Casting (manually) - converting a larger type to a smaller size type
double ->float -> long -> int -> char -> short -> byte
 */
double myD = 9.76d;
int myI =(int)myD;

System.out.println(myD);
System.out.println(myI);

// Real-Life Example:-
//  type casting where we create a program to calculate the percentage of a user's score in relation to the maximum score in a game.
// Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 423;
//Calculate the percentage

        float percentage =(float)userScore/maxScore *100.0f;
        System.out.println("user's percentage is " + percentage);





    }
}