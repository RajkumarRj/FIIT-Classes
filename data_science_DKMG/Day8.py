

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