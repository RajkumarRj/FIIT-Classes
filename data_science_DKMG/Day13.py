# software -> set of instructions that instruct hardwares 



import os 

from datetime import datetime

import sys


print(os.getcwd())

# print(os.chdir("E:/Fiiit"))


# os.mkdir("E:/Fiiit/data_science_DKMG/fiit/python")


# os.makedirs("E:/Fiiit/data_science_DKMG/multiple/single/double/triple")


# os.rename("E:/Fiiit/data_science_DKMG/multiple", "E:/Fiiit/data_science_DKMG/multi")

# os.rmdir("E:/Fiiit/data_science_DKMG/fiit/python")



# print(os.path.exists("E:/Fiiit/data_science_DKMG/student.txt"))


# print(os.path.getsize("E:/Fiiit/data_science_DKMG/student.txt"))



# datetime module 


print(datetime.now())


print(datetime.today().date())
print(datetime.today().time())


today = datetime.now()
# today = datetime(2023,6,20)



print(today.strftime("%d"))
print(today.strftime("%m"))
print(today.strftime("%y"))
print(today.strftime("%H"))
print(today.strftime("%M"))
print(today.strftime("%S"))
print(today.strftime("%A"))
print(today.strftime("%B"))



d1 = datetime(2000,10,22)

d2 = datetime.now()


print(d2-d1)

# system argument -> sysargv

print(sys.argv)


for i in sys.argv[1:]:
    print(i)

# print(sys.argv[1])
# print(sys.argv[2])

# print(sys.argv[3])




