from payment import Payment

class Cash(Payment):
    def __init__(self,ammount):
        super().__init__(ammount)