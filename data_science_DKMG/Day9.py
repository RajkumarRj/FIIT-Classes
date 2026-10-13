

class Product:
    def __init__(self , name, price, quanity):
        self.name = name
        self.price = price
        self.quantity = quanity

    def totalAmount(self):
        return self.price * self.quantity
        # print(self.price * self.quantity)



p1 = Product("Lapotp", 20000, 2)

print(p1.totalAmount())


p2 = Product("Monitor", 3000, 10)

result =  p2.totalAmount()

print(result) 