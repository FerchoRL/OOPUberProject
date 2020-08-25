package Java;

public class UberPool extends UberCar {

    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        //Use super to pass parameter to subclass (Using Inheritance)
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    
}