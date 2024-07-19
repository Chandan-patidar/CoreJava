package JavaNotesByChandan.oopsinjava.encapuslution;

 class Person {
    private String name;
    private int age;
    /*
     Encapsulating the name and age
     only approachable and used using
     methods defined
    */

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}

public class Aperson{



    // main function
    public static void main(String[] args) {

        Person Aperson = new Person();
        Aperson.setName("chandan");
        Aperson.setAge(25);
        System.out.println( "name :" + Aperson.getName());
        System.out.println( "Age :" + Aperson.getAge());


    }


}

