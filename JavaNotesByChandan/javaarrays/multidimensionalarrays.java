package JavaNotesByChandan.javaarrays;
/*
# Multidimensional Arrays
:- a Multidimensional Arrays ia an array of array
:- Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
:-To create a two-dimensional array, add each array within its own set of curly braces:

 eg:- int[][] myNumber  = {{1,2,3,4},{5,6,7}};

 */

public class multidimensionalarrays {
    public static void main(String[] args){
    //  Access Element :- the elements of the mNumber array
    // :-specify two index :one of the array, and one for the element inside that array.

        //This example accesses the third element (2) in the second array (1) of myNumbers:
        int[][] myNumber  = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumber[1][2]);

        // change element values :- you can also change the value of element
        myNumber[1][2] =9;
        System.out.println(myNumber[1][2]);

        //Loop Through a Multi-Dimensional Array
        // :- You can also use a for loop inside another for loop to get the elements of a two-dimensional array
        // (we still have to point to the two indexes):
        for( int i=0;i<=myNumber.length;++i){
            for (int j=0;j<myNumber[i].length; ++j){
            System.out.println(myNumber[i][j]);
            }

        }

        // for-each loop, which is considered easier to read and write:
        for (int[] row : myNumber){
            for( int i : row){
                System.out.println(i);
            }
        }

    }
}
