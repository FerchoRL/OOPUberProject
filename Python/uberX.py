from uberCar import UberCar

class UberX(UberCar):
    #This way to use Inheritance
    brand = str
    model = str

    def __init__(self,license,driver,brand,model):
        #Super class to inheritance. Use super()
        super().__init__(license,driver)
        self.brand = brand
        self.model = model