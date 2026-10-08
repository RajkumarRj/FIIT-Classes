# variables, -> field ,attributes
# functions -> method 

# constructor -> special method 

class Student:

    def display(self,name):
        print(f"Hello Student {name}")




obj =  Student()

obj.display("Monika")


obj1 = Student()
obj1.display("Dharshini")







class Bank:
    def __init__(self,name):
        self.name = name
        # print("Constructor called")
        


bank = Bank("Indian Bank")
print(bank.name)

sbi = Bank("SBI")
print(sbi.name)


canara = Bank("Canara")
print(canara.name)

# inheritance 


class Parent:
    salary = 50000
    def display(self):
        print("Parent class")


class Child(Parent):
    sport = "Cricket"




ganesh = Child()
ganesh.display()
print(ganesh.salary)

# single, multilevel, multiple, hybrid , heirachical


# class Grandparent:
#     def greet(self):
#         pass



# class Parent(Grandparent):



# class Child(Parent):


# class Father:
#     Fage = 45

# class Mother:
#     Mage = 43

# class Child(Father, Mother):
#     age = 18



# kaviya = Child()

# print(kaviya.age)
# print(kaviya.Mage)
# print(kaviya.Fage)



class Father:
    age = 45



class Child1(Father):

class Child2(Father):

    