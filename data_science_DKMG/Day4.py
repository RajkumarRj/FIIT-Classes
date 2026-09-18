print("collections")

# list   => ordered , mutable  , index , allow duplicate
# tuple  =>ordered,  immutable, index , allow duplicate
# set    => doesn't maintain order, immutable  ,  doesn't allow duplicate 
# dict    => key:value pairs , mutable 


marks  = [10,20,30,40, 50, 50 ]
# add 
marks.append(90)

# update
marks[3]  = 100

# update 
# print(marks[3])

del marks[0]

# print(marks)

# crud   => create, read, update , delete 


# tuple 
# tuple packing 
names = ("Ganesh", "kaviya","monika", "dharshini","kaviya")

# print(names[0])


# print(names.index("kaviya"))
# print(names.count("kaviya"))

# print(names)


# tuple unpacking 

name1, name2, name3, name4, name5  = names

# print(name4)



# set 

designation = {"HR"  , "HR", "Sales", "Sales", "Dev", "Dev"}



# print(designation)


# dictionary 

students  = {
    "name" : "FIIT",
    "course":"data science",
    "program":"python"
}

# students["duration"] = "6 months"

# students["name"] = "Ganesh"

# print(students["program"])


# print(students)


# functions   - reusable block of code 

# def functionname():
#     print("Welcome")


def greet():
    print("Welcome")


# parameter , argument 

# function calling 
greet()  
greet()  



def add(a,b):  # parameter
    sum = a+b
    print(sum)

add(10,20) # argument

add(500, 250)


# argument 
    # positional argument 
    # keyword argument 
    # variable length argument 
    # keyword variable length argument 


def display(name, age):
    print(f"My name is {name} and i'm {age} year old")


# keyword argumeent 
display(age =20, name = "Ganesh")

display("Kaviya", 20)

display("Monika", 20)



# variable length argument -> single *
# keyword variable length argument - double *
def total(**num):
    # print(sum(num))
    print(num)

# total(10,20,30,40,50,60,70,80,90)



total(a = 10, b= 20, c= 30, d= 40)



# recursion = a function calls itself 

# print 5 to 1

# for i in range(5,0,-1):
#     print(i)


def countdown(n):
    if n == 0 :
        return 
    countdown(n-1)
    print(n)

countdown(5)



data = [10,20, 40]
