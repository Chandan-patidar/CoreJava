package oops.constructor;

class  Flower{                    //NOUN

    //properties or attributes or variables     //Adjective
    String color;
    int size;
    String smell;

    public Flower(String color, int size, String smell) {
        System.out.println("constructor is called");
        this.color = color;
        this.size = size;
        this.smell = smell;
        
    }
e

}

public class ConstructorDemo {
    public static void main(String[] args) {

         Flower rose = new Flower("red",8,"pleasent");

        System.out.println(rose.color);
        System.out.println(rose.size);
        System.out.println(rose.smell);


    }
}
