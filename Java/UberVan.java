package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends UberCar{
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(String license, Account driver, 
    Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        //Use super to pass parameter to subclass (Using Inheritance)
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}