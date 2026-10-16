import random

numbers = (1,2,3,4,5)
player = None
while True:
    player = None
    while player not in numbers:
        try:
            player = int(input("Guess the number from 1 to 5: "))
        except ValueError:
            print("Invalid input. Please enter a number between 1 and 5")
    computer = random.choice(numbers)

    if player == computer:
        print("You WON!")
    else:
        print("You LOSE")

    print("The computer chose ", int(computer))
    print("======================")

    play_again = input("play again? Yes/No: ").lower()
    if play_again != "yes":
        break
print("Byeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee")