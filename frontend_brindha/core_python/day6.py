import math
import Calculator


Calculator.add(10,20,30,40,50)

result = Calculator.substraction(10,20)
print(result)

print(Calculator.substraction(20,20))

print(math.sqrt(64))



# exception handling 


print("Start")


# try, except, else,finally 

# try:

    # a = input("Enter your number")
    # print(a/10)

#     print(10/0)

# except ZeroDivisionError:
#     print("division by zero")
# except TypeError:
#     print("Type error")
# else:
#     print("No exception occured")
# finally:
#     print("exception handling is over")



# age = 17


# if(age < 18): 
#     raise ValueError("Age is less than 18")


# print("End")

# class IncorrectPasswordError(Exception):
#     pass



# if("123" != "345"):
#     raise IncorrectPasswordError("Incorrect password")



with open("student.txt", "a") as file:
    file.write("Fiit Academy")





