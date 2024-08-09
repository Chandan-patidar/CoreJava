package JavaNotesByChandan.oopsinjava.abstraction;
// abstract class
abstract class Animal {
    // abstract method (does not have body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

// subclass(inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        //The body of animalSound() is provided here
        System.out.println("This Pig say : wee wee");
    }
}
class main{
    public static void main(String[] args){
        Pig myPig = new Pig(); // create a pig object
        myPig.animalSound();
        myPig.sleep();

    }
}
