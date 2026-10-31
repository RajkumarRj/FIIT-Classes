

a = 4
b = 6

# bitwise operators 
#  & | ^   >> << 


print( a & b)

print( a | b)

print( a ^ b)


print( a >> 2)

print( a << 1)



# control structures 
# conditional statment, loops 

# conditional statement 
# if , if else, elif, nested if , match 
# indentation 
age = 9

# if age >= 18:
#     print("Eligible for vote")
#     print("If block")
# else :
#     print("Not eligible")
#     print("Turn 18 and check later")


# nested if 

voterId = False


if age>= 18:
    if voterId:
        print("you are eligible to vote")
    else:
        print("don't have voter id")
else:
    print("Turn 18 !")

# elif -> used to check multiple condition 


marks = 50

if marks >= 90:
    print("A1")
elif marks >=80:
    print("A2")
else:
    print("Fail")


match (marks):
    case 90:
        print("A1")
    case 80:
        print("B1")
    case _:
        print("fail")

