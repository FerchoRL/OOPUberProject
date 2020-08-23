from uberCar import UberCar
from account import Account
if __name__ == "__main__":
    mazda = UberCar()
    mazda.license = "QQO738"
    mazda.driver = "Fercho"
    mazda.passenger = 3
    print(vars(mazda))