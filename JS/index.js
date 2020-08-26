var account  = new User("Fernando Lagunes","INE","rlfernando7@gmail.com","12345")
var mazda = new UberCar("RDJ834",account,4)
mazda.printDataCar();
var jetta = new UberX("ALQ719",account,"Volkswagen","2003")
jetta.printDataCar();
var ferFirstPay = new Cash(345);
ferFirstPay.printInfoPayment();