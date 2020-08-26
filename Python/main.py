from uberCar import UberCar
from user import User
from uberX import UberX
from card import Card
if __name__ == "__main__":

    uberDriver = User("Fernando Lagunes","INE")
    mazda = UberCar("JDU394",uberDriver)
    print(vars(mazda.driver))

    Jetta = UberX("UWJ810",uberDriver,"VolksWagen","2003")
    print(vars(Jetta))

    ferPayment = Card(82.32,"3333333333333","","")
    print(vars(ferPayment))