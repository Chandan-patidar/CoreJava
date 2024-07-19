package oops.encapsulation;

class  Flower{                    //NOUN

    //properties or attributes or variables     //Adjective
     private String color;
     private int size;
     private String smell;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
    public String getColor(){
        return color;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Flower rose = new Flower();

        rose.setColor("red");
        rose.setSize(9);
        rose.setSmell("pleasant");

       String s= rose.getColor();
        System.out.println(s);


    }
}
