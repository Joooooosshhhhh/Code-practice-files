while True:
    try:
        user_age = int(input("Please enter your age: "))
        if user_age >= 18:
            print("You can enter")
        else:
            print("You are not permitted to enter")
    except ValueError:
        print("Please enter a valid number")
        continue

    while True:
        check_again = input("Would you like to check another person? (yes/no): ").lower()
        if check_again in ["yes", "no"]:
            break
        else:
            print("Please enter 'yes' or 'no'.")

    if check_again != "yes":
        break

print("bye")
