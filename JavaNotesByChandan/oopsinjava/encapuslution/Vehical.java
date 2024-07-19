package JavaNotesByChandan.oopsinjava.encapuslution;
/*
For each instance variable, a getter method returns its value while a setter method sets or updates its value.
Given this, getters and setters are also known as accessors and mutators, respectively.
 */
public class Vehical {
    private String colour;

    // Getter
    public String getColour() {
        return colour;

    }
    // setter
    public void setColour(String c) {
        this.colour = c;
    }

    public static void main(String[] args) {
        Vehical v1 = new Vehical();
        v1.setColour("red");
        System.out.println(v1.getColour());
    }

}


