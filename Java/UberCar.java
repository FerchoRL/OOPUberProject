package Java;

public class UberCar {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public UberCar(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("License: "+license+" Driver: "+driver.name);
    }
}