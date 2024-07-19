package JavaNotesByChandan.javaswitch;
// # Java Switch Statements
//Instead of writing many if.. else statement, you can use the switch statement .
//THe switch Statement select one of many code Block to be executed

/*
Syntax :-
 switch(expression){
    case x:
        // code block
        break;
    case y:
        `// code block
        break;
    default:
        //  code block


        }
 */

//  how it work  :>
// :-  the switch  expression is evaluated once
// :-The value of the expression is compared with the value of each case
// :- If there is match, the associated block of code is executed.
// :- The break, and default keyword are optional, and will be described later in this chapter


public class Switchstatements{
    public static void main(String[] args ){
    int day = 4;
    switch (day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Thesday");
            break;
        case 3:
            System.out.println("Wedneday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println();
        case 7:
            System.out.println("Sunday is good day");
            break;

    //  The default keyword :- The default keyword specifies some code  to run if  no case is match:
        default:
            System.out.println(" Looking forward to the Weekend ");
    }

    }
}
