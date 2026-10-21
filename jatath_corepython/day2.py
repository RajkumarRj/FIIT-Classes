
# type casting -> 

# convert one type into another type 

# implicit and explicit 

# implicit ->  data type conversion is done by python 

age = 22

age1 = 22.5

print(type(age + age1))


# Explicit ->  data type conversion is done by manually


mark = 489


mark1 = str(mark)

print(type(mark))
print(type(mark1))


monitor = "10"


print(type(float(monitor)))


markss = [10,20,30,40]

markTuple = tuple(markss)

print(type(markTuple))


# number = int( input("Enter your value: ")  ) 


# print( number, type(number))


# mutable vs immutable objects 

tup = [10,20,30]

tup.append(40)

print(tup)

# copy vs reference 

a = [10,20]

b = a.copy()

print(id(a))
print(id(b))


a.append(40)

print(a , b)