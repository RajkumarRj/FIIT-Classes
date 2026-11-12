# pre-built module 
import math

import random



print(random.random() * 10)

print(random.randint(35, 90))

print(random.randrange(10,100,5))



values = [10,20,30,40,50,60,70,80]

begin = random.randint(1,3)
last = random.randint(begin, 6)


for i in range(begin, last):
    print(values[i], "-", end="")


print(math.sqrt(64))

print(math.floor(85.687))

print(math.ceil(85.3))


print(math.pow(2, 3))





# def add(a,b):

#     return a+b