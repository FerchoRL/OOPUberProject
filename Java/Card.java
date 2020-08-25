package Java;

import java.util.Date;

public class Card extends Payment {
    String number;
    String cvv;
    Date date;

    public Card(String number, String cvv, Date date){
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }

    public void printInformationCar(){
        System.out.println("Number: "+number+" Cvv: "+cvv+" Date: "+date);
    }
}