from functools import reduce

#  print("Hello world")

# llm -> next predicting model 


# transformer architecture ->  

# google 

# lambda function 

# def square(x):

#     return x*x


# result  = square(5)

# print(result)



square = lambda x: x *x

print(   square(10)  )

# map, filter, reduce 

# list 

numbers = [1,2,3,4,5 , 6,7,8,9,10]


transform = list(map(lambda a: a*a , numbers))

print(transform)


evenNumber = list(filter(lambda y : y % 2 == 0 , numbers ))

print(evenNumber)


# reduce  , required import functools

sales = [1000,2000,3000]

reducedValue = reduce(lambda prev, curr : prev + curr, sales)

print(reducedValue)


res  = 0 
for i in sales:
    res += i
    # print(i)
   
print(res)


