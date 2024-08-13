package JavaNotesByChandan.oopsinjava.abstraction.Interface;
/*
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the
implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:


 */

// Interface
interface Animal {
    public void animalSound();// interface method ( does not have body)
    public void sleep(); // interface method ( does not have body)
}

// Pig "implements" the Animal interface
class Pig implements Animal{
    public void animalSound(){
        // The body of animalSound() is provided here
        System.out.println("The pig say : wee wee");
    }
    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzz");
        }
    }

    class main{
    public static void main(String[] args){
        Pig myPig = new Pig(); // create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}




