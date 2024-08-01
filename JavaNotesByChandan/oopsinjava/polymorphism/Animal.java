package JavaNotesByChandan.oopsinjava.polymorphism;
/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two
 subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

In the given exercise, here is a simple diagram illustrating polymorphism implementation:

Polymorphism: Animal Class with Bird and Cat Subclasses for Specific Sounds

 */
// Base class
//declare animal class
public class Animal {
    // method to print the sound the animal makes
    public void makeSound(){
        System.out.println("The animal makes a sound ");
    }
}

// subclass bird
// declare the bird class that extends the Animal class
class Bird extends Animal{
    public void makeSound(){
        System.out.println("The bird chirps");
    }
}

// subclass Cat
// declare the Cat class that  extends Animal class
 class Cat extends Animal{
    public void makeSound(){
        System.out.println("The cat meows" );
    }
}

//main .java
//Main class

// declare the Main class
class Main{
    // Main method :- Entry point of the Programme
    public static void main(String[] args){
        //Create the instance of Animal
        Animal animal = new Animal();
        // Create the instance of Bird
        Bird bird = new Bird();
        //Create the instance of Cat
        Cat cat = new Cat();

        // call the makeSound method ont the Animal instance
        animal.makeSound(); // Output: The animal makes a sound
        // call the makeSound method ont the bird instance
        bird.makeSound(); // Output: The bird chirps
        // call the makeSound method ont the Cat instance
        cat.makeSound(); // Output: The cat meows



    }

}

