
from abc import ABC , abstractmethod
# inheritance 
# single, multilevel, multiple, hybrid, hierarchical

# encapsulation -> binding of field  with methods



class Bank:
    def __init__(self, accountNo, balance):
        self.__accountNo = accountNo
        self.balance = balance

    # geter and setter
    def getAccountNo(self):
        return self.__accountNo 

    def setAccountNo(self , accountNo):
        self.__accountNo = accountNo
        

bank = Bank("123", "50000")


bank.setAccountNo("789")

# result = bank.getAccountNo()

print(bank.getAccountNo())

# print(bank.__accountNo )

# polymorphism -> many forms 
# method overriding -> same method in parent and subclass 



print(10/0)

class Payment:
    def pay(self):
        print("Payment paid successfully")



class UPI(Payment):
    def pay(self):
        print("Payment paid through UPI")


class COD(Payment):
    def pay(self):
        print("Payment will be paid in Cash")


upi = UPI()

upi.pay()



cod = COD()

cod.pay()




# Abstraction -> hiding internal implementation details 


class BrewingMachine(ABC):
   
    def milk(self):
        pass

    @abstractmethod
    def sugar(self):
        pass

    @abstractmethod
    def water(self):
        pass

    @abstractmethod
    def coffeePowder(self):
        pass


class Blackcoffee(BrewingMachine):

    def sugar(self):
        print("Sugar added")

    def water(self):
        print("Water addedd")

    def coffeePowder(self):
        print("Coffee powder added")



blackcoffee  = Blackcoffee()



class Coffee(BrewingMachine):

    def milk(self):
        print("Milk added")

   
    def sugar(self):
        print("Sugar added")
    
    def water(self):
        print("Water addedd")
    
    def coffeePowder(self):
        print("Coffee powder added")


coff = Coffee()



