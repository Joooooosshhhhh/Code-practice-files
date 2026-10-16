import random
import string

#Number 1
userAge = int(input("Enter your age: "))
userScore = int(input("Enter your score: "))

print("age: ", userAge)
print("Score: ", userScore)

if(userAge >= 18 and userScore >=50 ):
    print("ACCESS GRANTED")
    print("Welcome to Cyber Arcade")



    #Number 2
    plans = ["VIP", "Regular", "Premium"]

    if random.choice([True, False]):
        value = random.choice(plans)
    else:
        value = ' '.join(random.choices(string.ascii_letters, k=6))

    print()
    print("Generated Value: ", value)

    if value in plans:
        if (value == "VIP"):
            print("ACCESS GRANTED!")
            print("VIP access granted")

        elif(value == "Regular"):
            print("Regular access only")

        elif(value == "Premium"):
            print("Premium access granted")



        print()
        #Number 3
        items = ["keycard", "badge", "access_token", "coin", "ticket", "flashlight"]
    
        item_variable = random.choice(items)
    
        print("Player's item:", item_variable)
    
    
        if item_variable in items[0:3]:
            print("Valid Items Provided!")
            print("Proceed to the next checkpoint.")



            print()
            #Number 4
            security_code = random.randint(1, 20)

            print("Security Code:", security_code)

            code_bitconversion = bin(security_code)

            print("Binary Code:", code_bitconversion)

            playerCheck = security_code & 1
            adminCheck = security_code & 2

            if playerCheck != 0 and adminCheck != 0:
                print("Safe: On")
                print("Admin: On")
                print("then Player and Admin privileges are granted.")

            elif playerCheck != 0 and adminCheck == 0:
                print("Safe: On")
                print("Admin: Off")
                print("Player Privileges are Granted")

            elif playerCheck == 0 and adminCheck != 0:
                print("Safe: Off")
                print("Admin: On")
                print("Admin Privileges is Granted")


            else:
                print("Safe: Off")
                print("Admin: Off")
                print("Guest Access Provided")


            #number 5
            print()
            if (userAge >=18):
                print("Age: ", userAge)

                if (value == "VIP"):
                    print("VIP access granted")

                    if (item_variable == "access_token"):
                        print("Valid Items Provided!")

                        if (playerCheck != 0 and adminCheck == 0):
                            print("Security code is PLAYER only.")

                        else:
                            print("Security code is not PLAYER.")
                    

                    else:
                        print("deny VIP access")

                else:
                    print("VIP access not granted")

            else:
                print("Deny arcade access")

    
        else:
            print("Invalid Items Provided")
            print("Do not proceed")
        

    else:
        print("Invalid membership ")

        


else:
    print("ACCESS DENIED!")
    print("Age restriction.")

