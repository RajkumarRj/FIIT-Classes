

numbers = []

for i in range(1,11):
    if i % 2 == 0:
        numbers.append(i)
    # numbers.append(i)

print(numbers)


# num = [i for i in range(1,21)  if i % 2 != 0]

num = ["Even" if i %2 ==0 else "Odd"  for i in range(1,21) ]


print(num)


for i in range(5):
    for j in range(5):
        print(j+1, end=" ")
    print()


matrix = [ [j+1 for j in range(2)]  for i in range(2)]

print(matrix)


square = { i:i*i  for i in range(1,6)}

print(square)


matrix = [ [1,2,3] , [4,5,6]  ]


print(matrix[0][1])


person = {
    "Bridha":{
        "course":"python"
    },
    "Niha fathima":{
        "course":"java"
    }
}

print(person["Niha fathima"]["course"])


# parameter, argument 
def display(a):
    print(f"Welcome {a} to our website")


display("Brindha")
display("Niha fathima")



