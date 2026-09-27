# import csv

# # file = open("student.txt" , "r")

# # reads one line 
# # print(file.readline())

# # returns as list 
# # print(file.readlines())


# # for data in file:
# #     print(data)

# # file.close()






# with open("student.txt", "a") as file:
#     file.write("\nNiha fatima")
#     file.write("\nBrindha")



# with open("student.txt", "r") as file:
#     for data in file:
#         print(data)
#     # print(file.readlines())



# # csv file 

# # 101,nihafathima,SDE
# # 102,brindha,SWE


# data = [
#     ["Empid", "Name", "Department"],
#     [101,"Niha fathima", "SDE"],
#     [102, "Brindha", "SWE"]
# ]

# with open("students.csv" , mode="w" ) as file:
#     writer = csv.writer(file)

#     writer.writerows(data)


# print("Csv filed created")


# with open("students.csv", mode="r") as csvfile:
#     reader = csv.reader(csvfile)

#     for row in reader:
#         print(row)



# lambda function 

def square(x):
    print(x*x)


square(10)


# lambda argument : expression 

squared = lambda x : x*x

print(squared(100))


odd = lambda x : "Even" if x % 2 ==0 else "Odd"

print(odd(10))
print(odd(3))


# map, filter 

nums = [1,2,3,4]


doubled = list(map(lambda x : x*x ,nums ))

print(doubled)


even = list(filter(lambda x : x % 2 == 0 , nums))

print(even)