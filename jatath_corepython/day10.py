
# A = {1,2,3,4}

# B = {5,6,4,7}


# # set operations 

# # union 

# print( A | B)

# # intersection 

# print( A & B)

# # set difference 

# print(A - B)

# print(B - A)

# # Symmetric difference 

# print(A ^ B)



# Dictionaries 
# curly braces 
student = {
    "name":"Jagath",
    "age":17,
    "marks":[80,90,75,85,90]
}

student["age"] = 19

# del student["age"]

# print(student["marks"][1])

# print(student.keys())
# print(student.values())

# print(student.items())

# student.pop("name")

# student.popitem()

# student.clear()

student1 = student.copy()

print(student)

print(student1)

classRoom = {
    "className":"secion 2"
}

classRoom.update(student)

print(classRoom.get("name"))
print(len(classRoom))

print(classRoom)

