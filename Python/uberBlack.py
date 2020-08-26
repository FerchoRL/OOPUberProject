from uberCar import UberCar

class UberBlack(UberCar):
    #This way to use Inheritance
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self,license,driver,typeCarAccepted,seatsMaterial):
        #Super class to inheritance. Use super()
        super().__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial