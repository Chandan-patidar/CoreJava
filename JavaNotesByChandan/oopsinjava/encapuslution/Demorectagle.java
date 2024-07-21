package JavaNotesByChandan.oopsinjava.encapuslution;
/*
Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables.
 */
class Reactagle{
    private float length;
    private  float width;

    public float getLength(){
        return length;

    }
    public void  setLength(float length){
        this.length=length;

    }


    public float getWidth(){
        return width;

    }
    public void setWidth(float width){
        this.width=width;



    }

}

// main function
public  class Demorectagle {
    public static void main(String[] args){
        Reactagle x = new Reactagle();
        x.setLength(78.8f);
        x.setWidth(64.9f);
        System.out.println("Length : " + x.getLength());
        System.out.println("width : "  + x.getWidth());

    }
}