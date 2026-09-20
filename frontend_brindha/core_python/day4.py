
# functions  => reusable block of code 

# def greet(name ="Guest"):
#     print(f"Welcome {name} ")

# parameter, argument

# greet("Fiit")
# greet()

# default argument 
# positional argument,

# def display(name, age):
#     print(f"Welcome {name} and i'm {age} year old")

# display(age=22, name="Padma")
# keyword argument

# variable length argument

# def total(*num):
#     print(sum(num))


# total(10,20,30,40,50,60,70)
# keyword variable length argument

# def greetDis(**args):
#     print(args)

# greetDis(name="Brindha", name1="Niha",
#           name2="Fathima", name3="Padma")

# oop => object oriented programming 


class Student:
    college = "FIIT"

    def __init__(self, college):
        print("contructor called")
        self.college = college
        

    def greet(self):
        print("Welcome")



obj = Student("VKN")

# obj.college = "VKN"

print(obj.college)
obj.greet()


obj1 = Student("DKM")

print(obj1.college)


class Animal:
    def sound(self):
        print("Bark")


class Dog(Animal):
    def eat(self):
        print("Eat")


dog = Dog()

dog.eat()
dog.sound()

# multiple inheritance 
class Father:
    def des(self):
        print("Father")

class Mother:
    def desc(self):
        print("Mother")


class Child(Father, Mother):
    pass


child = Child()


child.des()
child.desc()


# multilevel inheritance => grand-parent-child

class Grand:
    def grand(self):
        print("Grand parent")


class Parent(Grand):
    def parent(self):
        print("Parent")


class Child1(Parent):
    pass


child1 = Child1()


child1.grand()
child1.parent()