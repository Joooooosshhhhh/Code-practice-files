
def get_height(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("invalid input. Please enter your height only")
def get_weight(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("invalid input. Please enter your weight only")



while True:
    weight = get_weight("Enter your WEIGHT in KILOGRAM: ")
    height = get_height("Enter your HEIGHT in METER: ")

    score = weight / (height ** 2)

    if score < 18.5 and score >= 8.5:
        category = "UNDERWEIGHT!"
    elif score >= 18.5 and score <= 24.9:
        category = "NORMAL AND HEALTHY!"
    elif score >= 25 and score <= 29.9:
        category = "OVERWEIGHT"
    elif score >= 30:
        category = "OBESE!"
    elif score < 8.5:
        print("Not possible")
        continue

    print(f"your bmi score is {score:.2f}, Category: {category}")

    again = input("Do you want to calculate again? Yes/No: ").lower()
    if again != "yes":
        print("Goodbye!")
        break