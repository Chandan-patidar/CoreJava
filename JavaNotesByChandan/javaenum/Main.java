package JavaNotesByChandan.javaenum;

public class Main{
    public static void main(String[] args){


        //for Level enum
//        Level myVar = Level.MEDIUM;
//        System.out.println(myVar);

        //for Power enum
        Power myPower = Power.MEDIUM;
        switch (myPower){
            case LOW :
                System.out.println(" Low  level");
                break;
            case MEDIUM:
                System.out.println("Medium level  ");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}