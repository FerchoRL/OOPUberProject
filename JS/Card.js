class Card extends Payment{
    constructor(ammount,number,cvv,date){
        super(ammount)
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}