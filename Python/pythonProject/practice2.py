# class Printer:
#
#     def printer(self, make, model, year, color):
#         self.make = make
#         self.model = model
#         self.year = year
#         self.color = color
#
#     def printing(self):
#         print(self.make+" is printing")
# from tokenize import endpats
#
# count = 0
# for number in range(1,10):
#     if number % 2 == 0:
#         count += 1
#         print(number)
# print("we have " + str(count) + " numbers")


# from datetime import datetime
# print("This is the date and time now: ")
# print(datetime.now())

# for number in range(0,100):
#     if number % 2 == 0:
#         print(number)

# while True:
#     user_input = int(input("type a number: "))
#
#     if user_input % 2 == 0:
#         print("your number " + str(user_input) + " is even")
#     else:
#         print("your number is odd")
#
#     quit = input("Try again? Yes/No: ").upper()
#     if quit != "YES":
#         print("Goodbye :)")
#         break


# original_string = "Hi I'm Marlon"
# reversed = original_string[::-1]
# print(reversed)


# def is_prime(number):
#     if number < 2:
#         return False
#
#     for i in range(2,number):
#         if number %i==0:
#             return False
#
#     return True
#
# number = int(input("enter a number: "))
# if is_prime(number):
#     print(f"{number} is a prime number")
# else:
#     print(f"{number} is not a prime number")


# input = input("plese type something: ")
# reverse = input[::-1]
#
# def is_palindrome(reverse):
#     if reverse == input:
#         return True
#
# if is_palindrome(reverse):
#     print(f"{input} is a palindrome!")
# else:
#     print(f"{input} is not a palindrome!")



# rows = int(input("height: "))
#
# for i in range(1, rows + 1):
#     print(" " * (rows - i), end="")
#     print("*" * (2*i - 1))


# *******
#  *****
#   ***
#    *

# rows = int(input("height: "))
#
# for i in range(1, rows - 1):
#     print(" " * (rows + 1), end="")
#     print("*" * (2 * rows + 1))




