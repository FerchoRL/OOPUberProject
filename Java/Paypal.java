package Java;

public class Paypal extends Payment{
    String email;

    public Paypal(Float ammount,String email){
        super(ammount);
        this.email = email;
    }
}