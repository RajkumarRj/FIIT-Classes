

class Student:

    def __init__(self, name , college):
        self.name = name
        self.college = college


    def display(self):
        print(self.name, self.college)




obj = Student(10, "VIT")


obj.display()