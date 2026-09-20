from abc import ABC , abstractmethod

print("Polymorphism")




# class, object . constructor 


class Parent:
    name = "" 

    def __init__(self,name):
        self.name = name

    def displayName(self):
        print(self.name)


# super => to call parent constructor , properties 

class Child(Parent):

    school = ""
    age = ""

    def __init__(self, name, school, age):

        super().__init__(name)
        self.school = school
        self.age = age

      
        

child = Child("Arun", "seventh day", 25)

print(child.name, child.age, child.school)



fiit = Parent("Brindha")

fiit.displayName()

fiit1 = Parent("Niha fathima")

fiit1.displayName()




# method overriding  => same method name in different implement in different class

# method overloading => python does not support 



class Animal:
    def sound(self):
        print("Sound...")



class Dog(Animal):
    def sound(self):
        print("Bark")



dog = Dog()


dog.sound()

# private acccess specifier  => access within same class

class Bank:
    accountNo = ""
    balance = ""
    def __init__(self, accountNo, balance):
        self.__accountNo = accountNo 
        self._balance = balance

    def get(self):
        print(self.__accountNo)



bank = Bank("238402480" , "5000")

bank.get()

# print(bank.accountNo)
print(bank._balance)






class Internal(ABC):
    @abstractmethod
    def sugar(self):
        pass

    @abstractmethod
    def coffeePoweer(self):
        pass

    @abstractmethod
    def milk(self):
        pass


class CoffeeButton(Internal):
    def sugar(self):
        print("Sugar added")
    def coffeePoweer(self):
        print("Coffee added")
    def milk(self):
        print("Milk added")


coffee = CoffeeButton()


coffee.milk()
coffee.coffeePoweer()
coffee.sugar()
