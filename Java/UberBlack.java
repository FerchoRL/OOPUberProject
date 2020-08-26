package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends UberCar {
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Integer passenger, 
    Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        //Use super to pass parameter to subclass (Using Inheritance)
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}