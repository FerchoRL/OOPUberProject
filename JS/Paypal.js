class Paypal extends Payment{
    constructor(ammount,email){
        super(ammount)
        this.email = email;
    }
}