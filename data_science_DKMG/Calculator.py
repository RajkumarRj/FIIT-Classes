import random


def add(a,b):
    return a + b


def randomNumber():

    colors = ["blue", "green", "black"]
    return random.choice(colors)



def generateOtp():

    return random.randint(1000 ,9999)