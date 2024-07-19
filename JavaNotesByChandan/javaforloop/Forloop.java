package JavaNotesByChandan.javaforloop;
/*
// #  for loop :- when you know exactly how many times you want to loop through a block of code, use the for loop instead
of while loop;

Syntax :-
for(statement 1; statement2; statement3){

// code to be executed
}

 */

//The example below will print the numbers 0 to 4:
public class Forloop {
    public static void main(String[] args ){
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        for (int i=0;i<10;i=i+2){
            System.out.println(i);
        }

    /*
    nested loop :-It is  also possible to place a loop inside loop another loop. This is called a nested loop.
    :- The "inner" will be executed one time for each iteration of the "outer loop" :

     */

        // outer loop
        for (int i= 1; i<=2; i++) {
            System.out.println("outer : " + i);// Execute 2 times

            //Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("inner :" + j); // Executes 6 times (2 * 3)
            }
        }


        /*
         # for Each loop :- There is also a "for each" loop, which is used exclusively to loop through element in array:
        Syntax:-
        for (type variableName : arrayName){
        //code block to be executed
        }
         */

        //The following example outputs all elements in the cars array, using a "for-each" loop:

        String[] cars ={"Volvo" ,"BMW","Ford","Mazda"};
                for(String  i: cars){
                    System.out.println(i);

                }










    }
}
