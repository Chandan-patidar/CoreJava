package JavaNotesByChandan.oopsinjava.polymorphism;
/*
Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football,
 Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.

 */
//Base class Spot class
//Sport.java
//Define Sport class
public class Sport {
    // Public  Method play print a message to the console
    public void play() {
        // print "playing  a sport ..." followed by a new line
        System.out.println("playing a sport game .. /n");
    }
}
    //Football.java
    // subclass Foot ball
    // Define the football class as subclass  of sport
    class Football extends Sport{
        // Override the play method from the Sports class
        public void play(){
            // print"Playing football"
            System.out.println("playing  football/....");
        }
    }

    //Basketball.java
    //subclass Basketball
    // Define the Basketball class as subclass of sport
    class Basketball extends Sport{
        //override the play Method from the sport class
        public void play(){
            //print "playing Basketball .."
            System.out.println("playing basketball ..");
        }
    }


    //Rugby.java
    //subclass Rugby
    // Define the rugby
    // Define the Rugby class as subclass of sport
    class Rugby extends Sport{
        //override the play method from the sport class
        public void play(){
            // print "playing rugby"
            System.out.println("playing Rugby.. ");
        }
    }


    // King.java
    // King class
    class King{
        public static void main(String[] args) { // Define main method
            // Create an instance of the all class
            Sport sport = new Sport();
            Football football = new Football();
            Basketball basketball = new Basketball();
            Rugby rugby = new Rugby();
            // Call the play method on the all the  instance

            sport.play();
            football.play();
            basketball.play();
            rugby.play();


        }
    }





