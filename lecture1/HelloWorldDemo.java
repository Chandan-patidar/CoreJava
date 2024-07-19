package lecture1;



class Papa {
    void tell(){
        System.out.println("hello , i am Papa");
    }
}

class Flower extends Papa{
//    void tell(){
//        System.out.println("hello , i am Chandan");
//    }
}



public class HelloWorldDemo  {

    public static void main(String[] args) {
        Flower x = new Flower();
    }
}
