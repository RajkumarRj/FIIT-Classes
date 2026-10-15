

# class Product:
#     def __init__(self , name, price, quanity):
#         self.name = name
#         self.price = price
#         self.quantity = quanity

#     def totalAmount(self):
#         return self.price * self.quantity
#         # print(self.price * self.quantity)



# p1 = Product("Lapotp", 20000, 2)

# print(p1.totalAmount())


# p2 = Product("Monitor", 3000, 10)

# result =  p2.totalAmount()

# print(result) 

# custom exception 
class syntaxError(Exception):
    pass

print("start")


# try , except , else, finally 

try:

    raise syntaxError("Syntax error occured")


    age =int( input("Enter age.."))

    if age < 0 :
        raise ValueError("Age is negative")


    # print(type(count))

    # arr = [10,20,30]

    # print(arr[5])

    # print(10/0)


except ZeroDivisionError:
    print("Error occured")
except IndexError:
    print("Index out of bound ")
except syntaxError:
    print("dsjfla")
except ValueError as e:
    print("global error" , e)

else:
    print("No Error")

finally:
    print("End of exception handling")


print("End")



