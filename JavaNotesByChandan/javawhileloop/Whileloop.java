package JavaNotesByChandan.javawhileloop;
// Loop  :-Loop can execute a block of code as long as a specific condition in reached
// :- loop are handy because they save time, reduces error and they make  code more readable.


/*
# while loop :- the while loop loops through a block of code as long as  a specified condition is true :

Syntax :-
while(condition){
   // code block to execute
}

 */

// the code in the loop will run, over and over again, as long as a variable (i) is less than 5:

public class Whileloop {
    public static void main(String[] args) {
        /*int i=0;

        while ( i<5) {
            System.out.println(i);
            i++;
        }

         */



/*
# do while loop :- the do while loop is variant of the while loop. This loop will execute the code block one, before
checking  if the condition is true , then it will repeat the loop as long as the condition is true

Syntax :-
do{
//code of block to be executed
}
while (condition );
 */
        int i=0;
        do{
            System.out.println(i);
            i++;

        }
        while (i<5);

    }
}





