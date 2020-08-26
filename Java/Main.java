package Java;
import java.util.Date;

class Main {
    public static void main(final String[] args) {
        //TODO: Etiqueta para resaltar algo pendiente
        Account uberAccount = new User("Fernando Ramila","INE","rlfernando7@gmail.com","12345");
        UberVan mazda = new UberVan("AMQ123",uberAccount,5);
        mazda.printDataCar();

        // Instantiate a Date object. Use F to fotmat 2004-02-09
        Date date = new Date();
        // Instantiate a FormatDate object
        //SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
        //Format our current date
        //Date dateFormated = ft.format(date);
        Card userMethodPay = new Card((float) 39.4, "111999333888", "327", date);
        userMethodPay.printInformationCar();
    }
}