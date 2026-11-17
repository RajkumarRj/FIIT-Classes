

# names = ["jagath", "fiit", "siddharth"]

# print(names)

# # for i in names:
# #     print(i, end=" ")



# # tuple () -> parenthesis

# # unmutable 
# # allow duplicate values 
# # ordered


# colors = ("Red", "Green", "Blue")

# # colors[0] = "Black"

# print(colors[0])


# # tuple packing
students =  (16, "Spark","jagath", "fiit")


# print(students)

# # tuple unpacking 

# (name , age , school, institue) = students


# print(name)

# print(age)
# print(school)

# print(institue)

# # students.count("")

# print(students.index("jagath"))

# listt = list(students)

# list = []


# userValue = int( input("Enter a value"))

# list.append(userValue)


# tupleee = tuple(list)

# print(tupleee)
# students.__add__(userValue)

# print(type(userValue))

# print(listt)



# set 
# unordered 
# doesn't allow duplicate values 
names = {"Jagath", "Siddharth"}

department = {"Computer", "Bio", "Commerce", "Computer", "Bio", "Commerce"}

department.add("Pure science")

department.update(names)

department.pop()

department.pop()


# spark = department.copy()
# department.remove("Pure science")

print(department)


# union, intersection 

A = {1,2,3 ,6}

B = {4,5,6}

print(A | B )

print(A & B )

print(A - B )

