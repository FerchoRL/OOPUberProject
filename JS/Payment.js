class Payment{
    constructor(ammount){
        this.id;
        this.ammount = ammount;
    }

    printInfoPayment() {
        console.log("Charge ammount: " + this.ammount);
    }
}