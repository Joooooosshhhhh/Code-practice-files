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


# user_input = int(input("Factorial Number: "))
# factorial = 1
#
# for i in range(1, user_input + 1):
#     factorial = factorial * i
# print(factorial)


# F(n) = F(n-1) + F(n-2)
# user_input = int(input("Enter a fibonacci sequence: "))
#
# def fibonacci(n):
#     fibo = [0,1]
#
#     while len(fibo) < n:
#         next_term = fibo [-1] + fibo[-2]
#         fibo.append(next_term)
#
#     return fibo
#
#
# seq = fibonacci(user_input)
#
# print(f"The first term is {user_input} term of the fibonacci sequence is {seq}")


# num1 = int(input("enter the first number: "))
# num2 = int(input("enter the second number: "))
#
# def add(num1, num2):
#     result = num1 + num2
#     return result
#
# sum = add(num1, num2)
# print(sum)


# for i in range(1,100):
#     if i % 2 == 0 :
#         print(i, end=" ")


# num_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
# even = [num for num in num_list if num % 2 == 0]
# print(f"Filtered number is ", even)


# user_input = int(input("Input number: "))
# digit_sum = sum([int(d) for d in str(user_input)])
# print(f"The sum of the digits is: {digit_sum}")


# user_input = input("Enter a number: ")
#
# digits = [int(d) for d in user_input]
#
# for digit in digits:
#     if digit % 2 == 0:
#         print(f"Digit: {digit} → even")
#     else:
#         print(f"Digit: {digit} → odd")
#
# digit_sum = sum(digits)
# print(f"Sum of digits: {digit_sum}")


# user_input = input("Enter a word or a sentence: ").lower()
# vowels = {"a": 0, "e": 0, "i": 0, "o": 0, "u": 0}
#
# for char in user_input:
#     if char in vowels:
#         vowels[char] += 1  # add 1 to that vowel's count
#
# # Print the vowel counts
# total = 0
# for v in vowels:
#     print(f"{v}: {vowels[v]}")
#     total += vowels[v]
#
# print(f"Total vowels: {total}")


# user_input = input("enter a number: ")
#
# odd_list = []
# for d in user_input:
#     if int(d) % 2 != 0:
#         odd_list.append(int(d))
#
# print("Even digits:", " ".join(str(d) for d in odd_list))
# print("Sum of even digits:", sum(odd_list))


# number = str(input("input number: "))
# sum_num = sum(int(digit) for digit in number)
# print(sum_num)


# number = (input("input number: "))
#
# total = 0
#
# for digit in number:
#     total += int(digit)
#     print(digit)
#
# print(f"total sum of the number is: ", total)


# user_input = (input("enter random numbers: "))
# odd = 0
#
# for digit in user_input:
#    if int(digit) % 2 != 0:
#        odd += 1
#
# print(f"there are {odd} odd digits.")


# user_input = (input("enter random numbers: "))
# highest = 0
#
# for digit in user_input:
#     if int(user_input) > highest:
#         highest = int(digit)
#
# print(f"the highest number in the digit is {highest}")


# user_input = (input("enter random numbers: "))
# highest = 0
# numbers = 0
#
# for digit in user_input:
#     if int(digit) > highest:
#         highest = int(digit)
#         numbers = user_input.count(str(highest))
# print(f"The largest digit is {highest} and it appears {numbers} times ")


# user_input = (input("enter random numbers: "))
# odd = 0
# even = 0
# odd_list = []
# even_list = []
#
# for digit in user_input:
#     if int(digit) % 2 == 0:
#         even += 1
#         even_list.append(digit)
#     else:
#         odd += 1
#         odd_list.append(digit)
#
# print(f"There are {even} even digits and {odd} odd digits.")
# print("the even digits are: " + ", " .join(even_list))
# print("the odd digits are: " + ", " .join(odd_list))


# user_input = input("enter any number or letter: ")
# plndrme = user_input[::-1]
#
# if plndrme == user_input:
#     print(user_input + " is a palindrome")
# else:
#     print(user_input + " is not a palindrome")


# user_input = (input("enter random numbers: "))
# sorted_num = sorted(user_input, reverse=True)
# print(f"the second highest number is:" + sorted_num[1])


# user_input = input("enter any number or letter: ")
# digit = 0
# letter = 0
# symbol = 0
# _digit = []
# _letter = []
# _symbol = []
#
# for dgt in user_input:
#     if dgt.isdigit():
#         digit +=1
#         _digit.append(dgt)
#     elif dgt.isalpha():
#         letter +=1
#         _letter.append(dgt)
#     else:
#         symbol += 1
#         _symbol.append(dgt)
#
#
# print("Number: " , digit, _digit)
# print("Letters: ", letter, _letter)
# print("Symbols: ", symbol, _symbol)


# user_input = input("enter any number or letter: ")
# symbol_count = 0
#
# for digit in user_input:
#     symbol_count += 1
#     if " " in digit:
#         symbol_count -= 1
#
# print(f"total symbol in this paragraph is: {symbol_count}")


# user_input = input("enter any number or letter: ").lower()
# vowel_letter = ["a", "e", "i", "o", "u"]
# vowel = 0
# consonant = 0
#
# for letter in user_input:
#     if letter.isalpha():
#         if letter.isalpha() in vowel_letter:
#             vowel += 1
#         else:
#             consonant += 1
#
# print(f"vowel: {vowel}")
# print(f"consonant: {consonant}")


# user_input = input("enter any number or letter: ")
# word_count = user_input.split()
# word_count2 = len(word_count)
#
# symbols = 0
# digits = 0
#
# for letter in user_input:
#     if letter.isalpha():
#         if letter in user_input:
#             symbols += 1
#     elif letter.isdigit():
#         if letter in user_input:
#             digits += 1
#
# print(f"word count: {word_count2}")
# print(f"symbol count: {symbols}")
# print(f"digit count: {digits}")


# numbers = [1, 2, 3, 4, 6, 7, 8, 9, 10]
# sum1 = sum(numbers)
# sum = 55
#
# result = sum - sum1
#
# print(f"the missing number is {result}")
#


# user_input = input("enter any number or letter: ")
# digits = []
# sum_ = 0
# even = 0
# odd = 0
#
# for i in user_input:
#     if i.isdigit():
#         digits.append(int(i))
#
# for d in digits:
#     if d % 2 == 0:
#         even += 1
#     else:
#         odd += 1
#
# print(f"Digits: {digits}")
# print(f"Sum of the numbers: {sum(digits)}")
# print(f"Even: {even}")
# print(f"Odd: {odd}")

# while True:
#     user_input = input("enter any number or letter: ")
#     vowel = 0
#     consonant = 0
#     digit = 0
#     space = 0
#     special_character = 0
#     uppercase = 0
#
#     vowel_letter = ["a", "e", "i", "o", "u"]
#
#     for i in user_input:
#         if i.isupper():
#             uppercase += 1
#         if i.isdigit():
#             digit += 1
#         elif i.isalpha():
#             if i.lower() in vowel_letter:
#                 vowel += 1
#             elif i not in vowel_letter:
#                 consonant += 1
#         elif i.isspace():
#             space += 1
#         else:
#             special_character += 1
#
#     print(f"Vowel: {vowel}")
#     print(f"Consonant: {consonant}")
#     print(f"Digit: {digit}")
#     print(f"Space: {space}")
#     print(f"Special Character: {special_character}")
#     print(f"Uppercase: {uppercase}")
#
#     proceed = input("Try Again? Yes/No: ").lower()
#     if proceed != "yes":
#         break





















