from payment import Payment

class Paypal(Payment):
    email = str

    def __init__(self,ammount,email):
        super().__init__(ammount)
        self.email = email