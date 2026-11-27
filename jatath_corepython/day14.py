# nested 

# def outer():
#     message = "Outer function"
#     def inner():
#         nonlocal message
#         message = "inner function"
#         print(message)

#     inner()
#     print(message)


# outer()

# lambda function 

# def square(x):
#     return x*x


# print(square(5))


# lambda arguments : expression 
square = lambda x,y : x*y


print(square(5,10))

# map, filter, reduce 


numbers = [1,2,3,4,5]


outputNumbers = list(map(lambda x :x *2, numbers))

print(outputNumbers)