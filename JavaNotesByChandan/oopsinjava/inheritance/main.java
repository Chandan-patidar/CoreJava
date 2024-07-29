package JavaNotesByChandan.oopsinjava.inheritance;

// 1. Single Inheritance

// Parent class
class One {
    public void print_gone(){
        System.out.println("Gone");
    }
}

// child class

class Two extends One{
    public void print_banega(){
        System.out.println("Don");
    }
}



// Derived class
public class main {
    public static void main(String[] args ){

        Two G= new Two();
        G.print_banega();
        G.print_gone();


    }

}



