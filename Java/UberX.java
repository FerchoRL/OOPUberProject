package Java;

public class UberX extends UberCar {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        //Use super to pass parameter to subclass (Using Inheritance)
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    
}