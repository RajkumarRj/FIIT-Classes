
name = "Brindha"

print(name[-1])
# print(name[::-1])


introduction  = """dlsfjal
dlfjasldf
dlfkjad
dflkasdj"""

# print(introduction)


print(name[0  :5])

print(name[4:])

print(name[:7])

# name[0] = 'F' // immutability

print(("Hello"  + " World" ) * 3)

course = "Javaprogrammingspringbootdjango"

print("Python"  in course)
print("Java"  in course)


for ch in course:
    print(ch , end="")


print(len(course))

print(course.lower())
print(course.upper())
print(course.capitalize())
print(course.title())
print(len(course.strip()))

print(course.rstrip())
print(course.lstrip())

print(course.replace("Java", "Python"))

print(course.split(","))


words = ["java","python", "react"]

print(",".join(words))


print(course.find("g"))

print(course.count("a"))


print(course.startswith("Java"))

print(course.endswith("go"))

print(course.index("g"))

print(course.isalpha())

print("Hello".isalpha())
print("123".isdigit())

print("hello123".isalnum())

print(" ".isspace())

print("HelloWorlD".swapcase())


def add(a,b):
   return a+b


result = add(10,10)

print(result)


def login(name = "Guest"):
    print(name)


login();
login("Brindha")