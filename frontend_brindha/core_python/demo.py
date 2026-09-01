# print("FIIT")

# a =10
# b=10

# print(a+b)


#  comments 

# control structures 

# conditional statement, loops 

# if, if else, elif , nested if, match 

age = 17

# indentation ``
# 1 tab = 4 space 

if age >18:
    print("You are eligible")
else:
    print("You are not eligible")


# elif 

marks = 50

if marks>=90:
    print("A grade")
elif marks>=80:
    print("B grade")
else:
    print("Fail")


# nested if 

voterId = True

if age >=18:
    if voterId:
        print("You are eligible to vote")
    else: 
        print("Voter id not available")
else:
    print("Age is less than 18")


# match 

day = 4

match day:
    case 1 :
        print("Monday")
    case 2: 
        print("Tuesday")
    case 3:
        print("Wednesday")
    case _:
        print("invalid choice")


# for , while  

# for(let i=0; i<10; i++){

# }

# range (stop)
# range (start, stop)
# range (start, stop, step)
# for i in range(1, 10, 2):
#     print("Welcome")

for i in range(10, 0, -1):
    if i == 5:
    #    break
        continue
    print(i)

# j =1
# while j<=10:
#     print(j)
#     j+=1

# jump statement 
# break, continue 






# nested loop 

for i in range(5):
    for j in range(5):
        print("*", end="")
    print()



# list, tuple, disctionary 

fruits = ["Apple", "Orange", "Guava"]

# mutable 
fruits[0] = "Mango"
print(fruits[0])

print(type(fruits))


courses = ("java", "mern", "python")
# immutable 
# courses[0] = "django"
print(courses[-2])
print(courses)
print(type(courses))


dict = {
    "name":"Fiit",
    "course":"java"
}


print(type(dict))
print(dict["name"])
print(dict["course"])


list = [50,20,30,40,50]

# ending index = n-1 => 4-1 = 3
print(list[1:4])

list.sort()
print(list[:3])

print(list[2:])



students = []

students.append("brindha")
students.append("fathima")


students[0] = "Brindha"
students[1] = "Niha fathima"
students.append("Brindha")
students.append("Brindha")
students.insert(0, "FIIT")
# students.remove("Brindha")
# students.pop(0)
# students.clear()

students.reverse()
print(students.index("Brindha"))
print(students.count("Brindha"))

print(students)



# tuple unpacking 

javacoure, merncourse, pythoncourse = courses

print(javacoure)
print(merncourse)
print(pythoncourse)



department = {"Engineering", "Brindha", "HR", "HR", "Sales", "Engineering"}

print(department)

name = {"Niha fathima", "Brindha"}


print(name | department)
print(name & department)

print(department - name)

print(department ^ name)



google = {
    "department":"Software Engineering",
    "Location":"Bangalore"
}

google["State"]= "Karnataka"

del google["State"]
print(google)


