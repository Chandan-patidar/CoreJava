package JavaNotesByChandan.javascope;
/*
#java scope :- variables are only accessible inside the region they are created. this is called scope .
#Method scope
variable declared inside a method are available anywhere in the method following the line of code in which they were declared:

 */
public class methodscope {
    public static void main(String[] args){
        //code here cannot use x
        int x=10;
        // code here can use x
        System.out.println(x);

    }
}
