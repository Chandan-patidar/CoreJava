package JavaNotesByChandan.javawhileloop;
//To demonstrate a practical example of the while loop, we have created a simple "countdown" program:


public class Reallifeex {
    public static void main(String[] args){
        int countdown = 3;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year !!");


// To demonstrate a practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:
// Print "Yatzy!" If the dice number is 6:
int dice =1 ;
while(dice <=6){
    if(dice <6){
        System.out.println("Yatzy");
    }else{
        System.out.println("Not Yatzy");
    }
    dice++;
}



    }
}

