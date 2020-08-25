from uberCar import UberCar
from account import Account
from uberX import UberX
if __name__ == "__main__":

    uberDriver = Account("Fernando Lagunes","INE")
    mazda = UberCar("JDU394",uberDriver)
    print(vars(mazda.driver))

    Jetta = UberX("UWJ810",uberDriver,"VolksWagen","2003")
    print(vars(Jetta))