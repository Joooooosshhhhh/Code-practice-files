midYearAverage = 95.59
yearEndAverage = 95
print(midYearAverage > yearEndAverage)

print ((5 < 6) and (10 > 9))

studentMark = 50
passmark = 35
print ((studentMark > passmark)and("Python is cool!"=="Python is cool!"))

x= 90
y= 10
print((x+y>99)and(x>y))

greeting="hello worldd! "
print(greeting*1)

studentName = "Josh"
studentSurname= "Calimlim"
studentAge = 16 
passedTest = True 
print(passedTest)

# Comment
name = "Sarrah"
surname = " Daniels"
print (name+surname)

"""Kunware alam ko ginagawa ko"""
x = 10
y = 10
print((10*10)+100)
print("done!")




num1 = 100
if (num1 > 40.85):
  print("Condition is True. Num1 is greater than 40.85. 100 > 40.85")

bolean1 = "qwerty"
bolean2 = "qwerty"
if (bolean1 == bolean2):
    print("It is true")
else:
    print("It is False")

boolean1 = True
boolean2 = False
if (boolean1 and boolean2) == True:
   print("It Is True.")
else:
   print("It Is False.")



# naneto
divident = 7335
devisor = 0
if (divident == devisor):
    print (divident/devisor)
else:
    print ("Division by 0 is undifined!")

dividend = 7335
divisor = 0
if (divisor != 0):
   print(dividend/divisor)
else:
   print("Division By 0 Is Undefined!")

#If-Elif-Else Ladder
month = "April"
if (month == "January"):
    print("The Month Is January")
elif (month == "February"):
    print("The Month Is February")
elif (month == "March"):
    print("The Month Is March")
elif (month == "Apil"):
    print("THe Month Is April")
elif (month == "May"):
   print("The Month Is May")
elif (month == "June"):
   print("The Month Is June")
elif (month == "July"):
   print("The Month Is July")
elif (month == "August"):
   print("The Month Is August")
elif (month == "September"):
   print("The Month Is September")
elif (month == "October"):
   print("The Month Is October")
elif (month == "November"):
   print("The Month Is November")
elif (month == "December"):
   print("The Month Is December")
else: 
    print("No Match Found")



num1 = 10
num2 = 10
operator = "+"

if (operator == "+"):
    print(num1 + num2)
elif (operator == "-"):
    print (num1 - num2)
elif (operator == "/"):
    print (num1 / num2)
elif (operator == "*"):
    print (num1 * num2)
else:
    print ("Error")

#For Loop
for i in range(10):
    print ("Hello World!")

#While Loop
messagesToRead = 0
while (messagesToRead != 100):
     messagesToRead = messagesToRead + 1
print ("0 Messages Left To Read!")

#Creating Functions
def sumOfTenAndTen():
    print(10+10)
sumOfTenAndTen()

def divisionFunction(): 
     print("Divident/Divisor")
divisionFunction()



#Function Arguments
def multiplicationFunction( x,y,z): 
  print (x*y*z)
multiplicationFunction(x=10, y=10, z=10)

def nameConcatenation (name, surname):
   print(name, surname)
nameConcatenation (name="Sarah", surname="Daniels")




#Spam
hehe = "HAHAHHASHHAHSHA "
print (hehe*1)

#os module
import os
path = "/"
dir_list = os.listdir(path)
print(dir_list)