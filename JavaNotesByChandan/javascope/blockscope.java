package JavaNotesByChandan.javascope;
/*
# Block Scope
A block of code refers to all of the code between curly braces{}.
:-Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows
the line in which the variable was declared:
 */
public class blockscope {
    public static void main(String[] args){
        // code here cannot use x
        {
            // This is a block
            // code here cannot use x
            int x = 100;
            //code here can use x
            System.out.println(x);

        }// The block ends here
        //code here cannot use x
    }
}
