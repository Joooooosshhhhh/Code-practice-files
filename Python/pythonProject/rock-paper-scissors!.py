import random

while True:
    choices = ["rock","paper","scissors"]
    computer = random.choice(choices)
    player = None

    while player not in choices:
        player = input("rock, paper, scissors?: ").lower()

    if player == computer:
        print("the computer chose:", computer)
        print("the player chose:", player)
        print("Tie!")
    elif player == 'rock':
        if computer == 'paper':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You LOSE!")
        if computer == 'scissors':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You WON!")
    elif player == 'scissors':
        if computer == 'paper':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You WON!")
        if computer == 'rock':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You LOSE!")
    elif player == 'paper':
        if computer == 'scissors':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You LOSE!")
        if computer == 'rock':
            print("the computer chose:", computer)
            print("the player chose:", player)
            print("You WON!")
    play_again = input("Play again? (yes/no): ").lower()
    if play_again != "yes":
        break

print("Bye")





