from account import Account
class UberCar:
    id = int
    license = str
    driver = Account
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver