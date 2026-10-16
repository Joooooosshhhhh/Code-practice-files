def get_number(prompt):
    while True:
        try:
            return int(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a valid number.")
def get_operator():
    while True:
        operator = input("Please choose an operator + | - | / | * : ")
        if operator in ('+', '-', '/', '*'):
            return operator
        else:
            print("Invalid Input. Please enter a valid input: + | - | / | * ")

while True:

    numbers1 = get_number("Please input your first number: ")
    operations = get_operator()
    numbers2 = get_number("Please input your second number: ")

    if operations == "+":
        print(numbers1 + numbers2)
    elif operations == "-":
        print(numbers1 - numbers2)
    elif operations == "/":
        try:
            print(numbers1 / numbers2)
        except ZeroDivisionError:
            print("Error: Division by zero is not allowed")
    else:
        print(numbers1 * numbers2)

    perform_again = input("Continue your calculations? Yes/No: ").lower()
    if perform_again != "yes":
        break
print("Byee")
