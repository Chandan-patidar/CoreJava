package JavaNotesByChandan.oopsinjava.abstraction.Interface;
/*
Multiple Interfaces
To implement multiple interfaces, separate them with a comma:


 */
 interface  FirstInterface {
     public void myMethod(); // interface method
}
interface  SecondInterface {
     public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface , SecondInterface{
     public void myMethod(){
         System.out.println(" some text ..");
     }
     public void myOtherMethod(){
         System.out.println("Some other text.. ");
     }

}

class Main {
     public static void main(String[] args){
         DemoClass myObj = new DemoClass();
                 myObj.myMethod();
                 myObj.myOtherMethod();
    }
}

