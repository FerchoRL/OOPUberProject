package Java;

public class UberCar {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    // Class constructor
    public UberCar(String license, Account driver, Integer passenger) {
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    // Class functions
    public void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.name 
        +" Passengers: "+passenger);
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}