# # exercise 1
# while True:
#     name = input("your name is?: ")
#     age = int(input("your age is?: "))
#     year = 2024 - age + 100
#
#     print(name + ", you will be 100 years old in " + str(year))
#     again = input("again? Yes or no?:").lower()
#     if again != "yes":
#         break

# # exercise 2
# number = int(input("input number: "))
# mod = number % 2
#
# if mod > 2:
#     print("you picked an even number")
# else:
#     print("you picked a odd number")

# # exercise 3
# a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
#
# for i in a:
#     if i < 5: print(i)

# # exercise 4
# num = int(input("check number: "))
#
# listrange = list(range(1, num+1))
#
# divisorlist = []
#
# for number in listrange:
#     if num % number == 0:
#         divisorlist.append(number)
#
# print(divisorlist)

# # exercise 5
# a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
# b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
#
# common_elements = list(set(a) & set(b))
#
# print(common_elements)

# # exercise 6
# while True:
#     user = input("enter a word: ")
#     reverse = user[::-1]
#     if user == reverse:
#         print("is is a palindrome!")
#     else:
#         print("it is not a palindrome!")
#
#     again = input("again? yes/no: ").lower()
#     if again != "yes":
#         break

# # Exercise 7
# a = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
#
# b = [number for number in a if number % 2 == 0]
#
# print(b)

choice = ["rock", "paper", "scissors"]

while True:
    p1 = input("PLAYER 1 - rock, paper, scissors?: ").lower()
    p2 = input("PLAYER 2 - rock, paper, scissors?: ").lower()

    if p1 == p2:
        print("Tie!!!")
    elif p1 == "rock":
        if p2 == "paper":
            print("player two won")
        elif p2 == "scissors":
            print("player one won")
    elif p1 == "paper":
        if p2 == "scissors":
            print("player two won")
        elif p2 == "rock":
            print("player one won")
    elif p1 == "scissors":
        if p2 == "rock":
            print("player two won")
        elif p2 == "paper":
            print("player one won")

    print("Congratulations!")
    print("==============================")
    again = input("play again? YES: ").lower()
    print("==============================")
    if again != "yes":
        break