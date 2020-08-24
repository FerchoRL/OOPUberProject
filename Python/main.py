from uberCar import UberCar
from account import Account
if __name__ == "__main__":

    uberDriver = Account("Fernando Lagunes","INE")
    mazda = UberCar("JDU394",uberDriver)
    print(vars(mazda.driver))