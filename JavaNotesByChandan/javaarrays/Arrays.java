package JavaNotesByChandan.javaarrays;
/*
# array :-are used to store multiple value in a variable ,instead of declaring separate variable for each value .
:- to declare array , define the variable type with square brackets

        String[] cars;

:-we have now declared a variable that hold an array of string. To insert values to it, you  can place the value in comma-
separated list inside the curly braces:

        String[] cars={"volvo","BMW","Ford","Mazda"}

:- To create array of  integer , you could write

        int[] ={10,20,30.40,50}

 */


/*# access the element of an  array

:- You can access an array element by referring to the index number.
:-This statement accesses the value of the first element in cars:

 */


public class Arrays {
    public static void main(String[] args){

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);

// create an array an integer , you could write
       // int[] = {10,20,30,40,50 };


//# change an array element:- to change the value of specific element, refer to the index number

        cars[0]="Opel";
        System.out.println(cars[0]);

// # Array length :- to find out  how many element  an array has ,use the length property
        System.out.println(cars.length);


// # loop through an array
//:- you can loop through the array element with the for loop , and use the length property to specify how many times
// the loop should run
        // outputs all elements in the cars array:
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }

// # loop through an array with for-each
//:- there  is also " for-each" loop , which is used exclusively to loop through element in array.


/*  Syntax :-
         for ( type variable : array){
         ......
         }

 */
        // The following example outputs all elements in the cars array, using a "for-each" loop:
          for (String i : cars){
              System.out.println(i);
        }







}
}
