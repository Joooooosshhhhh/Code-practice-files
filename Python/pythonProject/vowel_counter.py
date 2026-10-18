userInput = input("Enter a  text: ").lower()
vowel = ["a", "e", "i", "o", "u"]
vowelCount = 0


for i in userInput:
    if i in vowel:
        vowelCount += 1

print("vowel count:", vowelCount)
