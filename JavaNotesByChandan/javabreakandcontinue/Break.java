package JavaNotesByChandan.javabreakandcontinue;
// # break:- It  was used  to "jump out" of switch statement
// :- the break statement is also be used jump out  of a loop

public class Break {
    public static void main(String[] args){
        //This example stops the loop when i is equal to 4:
        for (int i = 0 ; i <= 10 ; i++) {
            if (i == 4) {
                break;
            }

            System.out.println(i);
        }

    }
}
