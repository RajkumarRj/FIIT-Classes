# string is a sequence of character 

name = "Jagath kumar"

print(len(name))
# name[0] = "P"


# immutable  => unchangeable 

print(name[0])

print(name[-3])


print(name)


# string methods 

# string slicing 

result = name[7:]

# result = name[0:8 : 2 ]

# result = name[::-1 ]
print(result)




# string operators 
# concatenation 

str1 = "hello"
str2 = "World"

print( str1 + " " + str2)
 

# repetition  * 

print("jagath "  * 5)


# membership operators 

# in , not in 

course = "Python programming"

print("Po" not  in course)
print("Java" in course)


print("jagath"  == "jagath")
print("jagath"  != "jagath")


# iterating string 

for ch in name:
    print(ch)


# print(name[0])
# print(name[1])
# print(name[2])
# print(name[3])


print( name.upper()  )

print( name.lower()  )

print(name.capitalize())

print(  name.title()  )



print(  name.strip() )

print( name.lstrip()  )

print( name.rstrip()  )


print(  name.replace("J", "Python")  )


print(   name.count("a")  )




print(name.startswith("Jat"))

print(name.endswith("r"))



print("123".isalpha())

print("asdfa".isalnum())


print("123".isdigit())


print("JAGATH".swapcase())


# formatting string 
ageee = 20

print(  f"My name is {name} and my age is {ageee}")