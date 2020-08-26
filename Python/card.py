from payment import Payment

class Card(Payment):
    number = str
    cvv = str
    date = str

    def __init__(self,ammount,number,cvv,date):
        super().__init__(ammount)
        self.number = number
        self.cvv = cvv
        self.date = date