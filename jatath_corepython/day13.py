

# types of arguments 

# positional argument
# keyword argument
# variable length argument 
# keyword-variable length argument 


def greet(age, name):
    print(f"Hello {name} and you are {age} year old")



# greet("jagath" , 16) #positional argument 


# greet(name = "jagath", age= 30)  #keyword argument


# variable length argument 

def add(*result):

    print(min(result))
    print(max(result))
    print(sum(result))
    
add(10,30,40,50,60,80,70)



# keyword length argument 

def department(**result):
    print(result)



department(name = "Computer science", studentStrength = 50, roomNo = 101)


# variable scope 

# global scope
# local scope 



name = "jagath"

def school():
    global name
    name = "fiit"
    print(name)


school()

print(name)