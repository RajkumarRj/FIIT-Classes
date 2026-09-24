# comprehensive 


numbers = []


for i in range(1,11):
    numbers.append(i)
print(numbers)


# list comprehensive 


list = [ i*i  for i in range(2,7)  ]

print(list)



even  = [i  for i in range(1,21) if i % 2 == 0  ]

print(even)


evenOddName = [ "Even" if i % 2 == 0 else "Odd"  for i in range(1,7)    ]


print(evenOddName)




# nested collections 

matrix = [ [j for j in range(3)] for i in range(3)]

print(matrix)

# dict 

student = {

    "101":{
        "name":"Teja",
        "address":{
            "street":"DKM street"
        }
    },
    "102":{
        "name":"Lavanya"
    }
}


print(student["101"]["address"]["street"])

print(student["102"])




# oops 



