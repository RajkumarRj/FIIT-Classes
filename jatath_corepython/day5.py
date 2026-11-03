# loops 

even_count = 0
odd_count = 0

for i in range(10):
    if i % 2 == 0:
        even_count += 1
        print("Even number", i)
    else:
        odd_count += 1
        print("Odd number",i)


print(even_count)
print(odd_count)



# while loop 

# initialization 
# condition
# increment / decrement

j = 10

while j > 0:
    print(j)
    j -= 1


# nested loop 

for i in range(10):

    for jagath in range(10):
        print("*" , end=" ")

    print()

