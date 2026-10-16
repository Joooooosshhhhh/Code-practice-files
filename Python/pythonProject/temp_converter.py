while True:
    try:
        user_input = input("Type 'C' to convert Fahrenheit to Celcius "
                           "or type 'F to convert Celcius to Fahrenheit: ").upper()

        if user_input not in ["C", "F"]:
            raise ValueError("Invalid input. Type C or F")

        number_input = float(input("press the number that will be converted: "))

        if user_input == "C":
            F_to_C = (number_input-32) * 5/9
            print(f"{F_to_C:.2f} Celsius")

        elif user_input == "F":
            C_to_F = (number_input * 9/5) + 32
            print(f"{C_to_F:.2f} Fahrenheit")


    except ValueError as e:
        print(f"Invalid input: {e}")
        continue

    quit = input("Try again? Yes/No: ").upper()

    if quit != "YES":
        print("Goodbye :)")
        break