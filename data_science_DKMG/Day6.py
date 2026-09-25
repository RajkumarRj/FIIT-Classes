# oops => object oriented programming 


# class , object 
# Inheritance, encapsulation, abstraction, polymorphism

# class is a blueprint for object 
# object is instance of class 


class Student:
    # def __init__(self):
    #     print("Constructor called")

    def __init__(self, name , age):
        self.name = name
        self.age = age
        

    def display(self ):
        print(f"Welcome {self.name},{self.age}")



# student1 = Student("Kaviya", 20)


# student1.display()


# student2 = Student("Dharshini",20)

# student2.display()


# student3 = Student("Ganesh",22)

# student3.display()




# create a class bank , sbi, indian, canara 


class Bank:

    def __init__(self , bankName):
        self.bankName = bankName

    def deposit(self):
        print(f"Amount has been deposited to {self.bankName}")
        

sbibank = Bank("SBI")

sbibank.deposit()


indianbank = Bank("Indian Bank")

indianbank.deposit()






# encapsulation  => binding of data with methods


class Company:

    def __init__(self, companyName, project):
        self.companyName = companyName
        self.__project = project

    def getProject(self):
        return self.__project
    



tcs  = Company("TCS", "AI model")
print(tcs.companyName)

result = tcs.getProject()

print(result)
# print(tcs.project)


        




