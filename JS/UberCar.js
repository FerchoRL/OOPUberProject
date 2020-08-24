class UberCar {
    constructor(license, driver, passenger) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }
    printDataCar() {
        console.log(this.driver)
        console.log("License: " + this.license + " Driver: " + this.driver.name);
    }
}

