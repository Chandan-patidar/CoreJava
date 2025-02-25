package JavaNotesByChandan.javabooleans;

public class Bexpression {
    public static void main(String[] args) {
    /*
    :-  A booleans expression returns a boolean value : true and false
    :-  This his useful to build logic, and find answers
    */
        // comparison operator
        // greater than(>) operator to find the expression of true or false
        
        int x = 10;
        int y = 5;
        System.out.println(x > y);
        // or even

        System.out.println(60>70);

        // equal to (==) operator
        System.out.println(x==10);

        System.out.println(20==10);

        // real life example
        //we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18:

        int myAge =25;
        int votingAge =18 ;
        System.out.println(myAge >= votingAge);

        // if ...else

        if(myAge >= votingAge){
            System.out.println("old enough  to vote ! ");
        }else{
            System.out.println(" Note old enough to vote ! ");
        }



    }

}
