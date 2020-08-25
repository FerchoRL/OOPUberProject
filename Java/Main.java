package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
    public static void main(final String[] args) {
        //TODO: Etiqueta para resaltar algo pendiente
        Account uberAccount = new Account("Fernando Ramila","INE","rlfernando7@gmail.com","12345");
        UberCar mazda = new UberCar("AMQ123",uberAccount);
        mazda.passenger = 4;
        //mazda.printDataCar();

        // Instantiate a Date object. Use F to fotmat 2004-02-09
        Date date = new Date();
        // Instantiate a FormatDate object
        //SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
        //Format our current date
        //Date dateFormated = ft.format(date);
        Card userMethodPay = new Card("111999333888", "327", date);
        userMethodPay.printInformationCar();

    }
}