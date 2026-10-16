# STR
# first_name = "Marlon"
# last_name = "Calimlim"
# full_name = first_name + " " + last_name
# print("Hello " + full_name)

# INT
# age = int(input())
# print("your age is "+ str(age))

# FLOAT
# height = 5.10
# print("your height is " + str(height) + " feet")

# BOOLEAN
# Human = True
# print("are you a human? " + str(Human))

#MULTIPLE ASSIGNMENTS
# name, age, human = "Marlon", 17, True
# print(name)
# print(age)
# print(human)
#
# Marlon = Josh = 17
# print(Marlon)
# print(Josh)

# name = input("what is your name?: ")
# age = int(input("how old are you?: "))
# height = float(input("how tall are you in cm?: "))
#
# print("Hello there " + name)
# print("you are " + str(age) + " years old")
# print("you are " + str(height) + "cm tall")


# age = int(input("Please enter your age to Enter: "))
#
# if age >= 18:
#     print("WELCOME, you are allowed to enter")
# elif age <=0:
#     print("you are not even born ")
#
# else:
#     print('you are not allowed to enter')

# temp = int(input("What is the temperature today?: "))
#
# if temp >= 40 or temp <= 20:
#     print("the weather is bad today")
#     print("stay inside")
# elif temp < 40 or temp > 20:
#     print("the weather is good today")

# name = ""
# while len(name) == 0:
#     name = input("What is your name?: ")
# print("hello there " + name)

# import time
#
# for seconds in range(10,0,-1):
#     print(seconds)
#     time.sleep(1)
# print("wake the pak up")


# rows = int(input("rows?: "))
# columns = int(input("Columns?: "))
# symbol = input("symbols?: ")
#
# for i in range(rows):
#     for j in range(columns):
#         print(symbol, end="")
#     print()


# while True:
#     name = input("enter your name: ")
#     if name != "":
#         break

# phone_numbers = "sdfsadf sfa;sdfs af"
#
# for i in phone_numbers:
#     if i == " ":
#         continue
#     print(i, end="")

# for i in range(1,21):
#     if i == 15:
#         pass
#     else:
#         print(i)

# name = ("Marlon", "Josh", "Calimlim")
#
# for x in name:
#     print(x)

# name = "Marlon Josh"
#
# if (name[0].isupper()):
#     name = name.lower()
#
# first_name = name[0:6].upper()
#
# print(first_name)

# def hello(name):
#     print("hello " + name + ", nice to meet you!")
#     print("have a nice day")
#
# name = "Marlon"
# hello(name)

# def add (x, y):
#     return x + y
#
# x = int(input("first number: "))
# y = int(input("second number: "))
#
# result = add(x,y)
# print(result)


# def hello(first, middle, last):
#     print("Hello " + first + middle + last + "!")
#
# hello("Marlon ", "Josh ", "Calimlim")

# args
# def add(*args):
#     sum = 0
#     for i in args:
#         sum += i
#     return sum
#
# print(add(1,2,3,4,5,6))


# import random
# dice = random.randint(1,6)
#
# print(dice)

# import practice2 as p2
# p2.hello()
# p2.def2()

# import random
#
# choices = ["rock","paper","scissors"]
#
# computer = random.choice(choices)
#
# print(computer)


# import practice2
#
# printer = ("Epson","L3250", 2023, "Black")
#
# print(printer)
#
# printer.printing()

# class Car:
#
#     def Turn_on(self):
#         print("This car is starting")
#         return self
#
#     def accelerate(self):
#         print("The car is accelerating")
#         return self
#
#     def slow_down(self):
#         print("The car is slowing down")
#         return self
#
#     def turn_off(self):
#         print("The car is turned off")
#         return self
#
# car = Car()
#
# (car.Turn_on()
#  .accelerate()
#  .slow_down()
#  .turn_off())


# class Duck:
#
#     def walking(self):
#         print("The duck is walking")
#
#     def talking(self):
#         print("The duck is quacking")
#
# class Chicken:
#
#     def walking(self):
#         print("The chicken is walking")
#
#     def talking(self):
#         print("The chicken is clucking")
#
# class Person:
#     def caught(self,chicken):
#         chicken.walking()
#         chicken.talking()
#         print("you caught the animal")
#
# duck = Duck()
# chicken = Chicken()
# person = Person()
#
# person.caught(duck)

# def number(x):
#     print(x + 2)
#
# result = number(5)
#
# print(result)

# # name = lambda first_name, last_name: first_name +" "+ last_name
# # print(name("Marlon","Josh"))
# def name(first_name, last_name):
#     print(first_name + " " + last_name)
# print(name("Marlon", "Josh"))


# age = lambda age: True if age >= 18 else false
# print(age(19))
# def age(x):
#     if x >= 18:
#        return True
#     else:
#        return False
#
# print(age(17))

# import time
# print(time.ctime( 0))

# from tkinter import *
#
# window = Tk()
# window. geometry("300x200")
# window.title("Marlon")
# # window.config(background="#37383b")
#
# label = Label(window, text="Hello Marlon", font=("Arial", 25, "bold"))
# label.pack()
#
# window.mainloop()

# for i in range(0,6):
#     print( "*" * i)

# from tkinter import *
# from tkinter import filedialog
# from docx import Document
#
# def openFile():
#     filepath = filedialog.askopenfilename(filetypes=[("Word files", "*.docx")])
#     if filepath:
#         try:
#             document = Document(filepath)
#             fullText = []
#             for para in document.paragraphs:
#                 fullText.append(para.text)
#             print('\n'.join(fullText))
#         except Exception as e:
#             print(f"Error reading file: {e}")
#
# window = Tk()
# button = Button(window, command=openFile, text="click click")
# button.pack()
# window.mainloop()

# from tkinter import *
# from tkinter import ttk
#
# window = Tk()
# window.title("Tab box")
#
# notebook = ttk.Notebook(window)
#
# tab1 = Frame(notebook)
# tab2 = Frame(notebook)
#
# notebook.add(tab1, text="tab1")
# notebook.add(tab2, text="tab2")
#
# notebook.pack()
#
# Label(tab1, text="Hello", width=40, height=25).pack()
# Label(tab2, text="Hi", width=50, height=25).pack()
#
# window.mainloop()

import string
import time

text = "Hello world"
temp = " "
for ch in text:
    for i in string.printable:
        if i == ch or ch == i:
            time.sleep(0.02)
            print(temp+i)
            temp +=ch
            break
        else:
            time.sleep(0.02)
            print(temp+i)