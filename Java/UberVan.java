package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends UberCar{
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(final String license, final Account driver, final Integer passenger, 
    final Map<String,Map<String,Integer>> typeCarAccepted, final ArrayList<String> seatsMaterial) {
        //Use super to pass parameter to subclass (Using Inheritance)
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver, Integer passenger) {
        super(license, driver, passenger);
	}

	@Override
    public void printDataCar() {
        // TODO Auto-generated method stub
        System.out.println("Sobreescribiendo el metodo con polimorfismo");
    }
}