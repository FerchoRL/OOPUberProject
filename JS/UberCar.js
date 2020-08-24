function UberCar(license,driver,passenger) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
}

UberCar.prototype.printDataCar = function(){
    console.log("License: "+this.license+" Driver: "+this.driver);
}