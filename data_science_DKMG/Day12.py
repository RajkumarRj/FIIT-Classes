import csv
import json

print("File handling")



# mode -> r,w, a 


# file = open("student.txt", "w")

# file.write("Data science \n")
# file.write("Excel")

# file.close()


# context manager 

# with open('student.txt', "w") as fiit:
#     fiit.write("Data science",)
#     fiit.write("Excel")
#     fiit.write("Power BI")

with open('student.txt', "a") as fiit:
    fiit.write("Data science",)
    fiit.write("Excel")
    fiit.write("Power BI")

with open('student.txt', "r") as fiit:
    # print(fiit.read()) -> reads total file content
    # print(fiit.readline()) -> reads line by line 
    print(fiit.readlines()) 
   

# csv -> comma separated value

# id,name,age
# 1,arun,20
# 2,naren,22


with open("csvfile.csv", "w",newline="") as fiit:
    writer = csv.writer(fiit)
    writer.writerow(["id","name","age"])
    writer.writerow([1,"Arun",20])
    writer.writerow([2,"Naren",22])


with open("csvfile.csv", "r") as fiit:
    reader = csv.reader(fiit)
    for row in reader:
        print(row)



# dict json 

student = {
    "name":"Fiit",
    "course":"Data science"
}


print(type(student))


jsonConvertor = json.dumps(student)  # to convert dict to json


dictConvertor = json.loads(jsonConvertor) # to convert json to dict 

print(type(jsonConvertor))
print(type(dictConvertor))




