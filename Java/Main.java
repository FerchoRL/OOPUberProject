package Java;

class Main {
    public static void main(final String[] args) {
        //TODO: Etiqueta para resaltar algo pendiente
        Account uberAccount = new Account("Fernando Ramila","INE","rlfernando7@gmail.com","12345");
        UberCar mazda = new UberCar("AMQ123",uberAccount);
        mazda.passenger = 4;
        mazda.printDataCar();
    }
}