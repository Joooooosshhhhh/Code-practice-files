

import random

def roll_dice (): 
    print("roll the dice")
    return random.randint (1,6)

print ("welcome")
while True:
    input("press enter to roll the dice...")
    dice_result = roll_dice ()
    print("print your number", dice_result,"congratulations")


