# control structures 

# conditional statement and loops 


# if

age = 20

if age>=18:
    print("You are eligible to vote")
else:
    print("You are not eligible  vote")


voterId = False

if age>=18:
    if voterId:
        print("You are eligible to vote")
    else:
        print("you don't have voter id")
else:
    print("You are under 18 ")



marks = 68

if marks >=90:
    print("A")
elif marks >= 80:
    print("B")
elif marks >=70:
    print("C")
else :
    print("Fail")


# nested if


# if else
# elif 



# match

role = "softwareeee"

match role :
    case "software":
        print("80k salary")
    case "networking":
        print("40k salary")
    case "DS & AI":
        print("90k salary")
    case _:
        print("None of them match")


# loops  => for , while 


# range (stop)
# range (start, stop)
# range (start, stop, step)

for i in range(1, 10, 2):
    print("Welcome", i)


# find even  numbers between 1 to 20

for i in range(1,21):
    if i % 2 != 0:
        print(i)

# while 

# j=1
# while j<=10:
#     print(j)
#     j += 1


k = 10
while k >=1:
    print(k)
    k -= 1


# nested loop 

for i in range (3):
    for j in range(3):
        print("*" , end="")
    print()


# jump statement 
# break continue 

for i in range(1,11):
    if i == 5:
        # break
        continue
    print(i)
 