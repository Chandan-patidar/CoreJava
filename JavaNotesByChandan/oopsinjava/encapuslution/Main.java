package JavaNotesByChandan.oopsinjava.encapuslution;
/*

Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and
mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.

 */

class Car{
    private String companyName;
    private  String modelName;
    private int year;
    private double mileage;

    //Getter method for company_name
    public String getCompanyName(){
        return companyName;
    }
    // Setter method for company_name
    public void setCompanyName( String companyName ){
    this.companyName = companyName;
    }
//--------------------------------------------------------------------------------------

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String luxuryCoupe ){
        this.modelName = modelName;
    }
//------------------------------------------------------------------------------------------
    public int getYear(){
        return year;
    }

    public void setYear(int year){

    }


    public void setMileage() {
    }
}
public class Main {
    public static void main(String[] args){
    Car car1 = new Car();

    // Set values using setter methods
        car1.setCompanyName("Lexus");
        car1.setModelName("luxuryCoupe");
        car1.setYear(1958);
        car1.setMileage();
    // Get values using getter methods
        String companyName = car1.getCompanyName();
        String modelName =car1.getModelName();
        // Print the values

        System.out.println("companyName : " + companyName);
        System.out.println("modelName : " + modelName);
        System.out.println("modelName : " + modelName);
        System.out.println("modelName : " + modelName);



    }
}
