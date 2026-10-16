from array import array

# PYTHON DATA MANIPULATION ACTIVITY

print("=== ACTIVITY: Student Score Data Manipulator ===")

# Activity 1
scores = array('i')

scoreLength = int(input("how many score do you want to enter?: "))

for score in range(scoreLength):
    individualScore = int(input(f"Enter score {score + 1}: "))
    scores.append(individualScore)

print("Scores:", scores)
print("Number of Scores: ", len(scores))

print("\n=======================================\n")



# Activity 2

highestScore = scores[0]
lowestScore = scores[0]
totalScore = 0
passed = 0
failed = 0
avg = 0

for i in range(len(scores)):

    totalScore += scores[i]

    if scores[i] > highestScore:
        highestScore = scores[i]
    if scores[i] < lowestScore:
        lowestScore = scores[i]


    if scores[i] >= 75:
        passed += 1
    else:
        failed += 1

avg = totalScore / len(scores)

print("Highest Score: ", highestScore)
print("Lowest Score: ", lowestScore)
print("Total Score: ", totalScore)
print("Average: ", avg)
print("\nPassed: ", passed)
print("Failed: ", failed)

print("\n=======================================\n")



# Activity 3

arrayToList = list(scores)

print("Array converted to List;")
print(arrayToList)
print()

addScore = int(input("Enter an additional score: "))
arrayToList.append(addScore)
print()

removeScore = int(input("Enter a score to be removed: "))

if removeScore in arrayToList:
    arrayToList.remove(removeScore)
    print()
    print(f"{removeScore} was removed.")

else:
    print()
    print(f"{removeScore} was not found in the list.")

print()

print("Updated List:")
print(arrayToList)

print("\n=======================================\n")



# Activity 4

# Part A: list to Tuple

listToTuple = tuple(arrayToList)

print("Tuple:")
print(listToTuple)
print()

print("First Score: ", listToTuple[0])
print("Last Score: ", listToTuple[len(listToTuple) - 1])
print()

print("Number of Score:", len(listToTuple))


# Part B: list to set

listToSet = set(arrayToList)

print()
print("Set of unique score:")
print(listToSet)
print()

print("Number of unique scores: ", len(listToSet))
print()

setSearch = int(input("Enter a score to search: "))

if setSearch in listToSet:
    print(f"{setSearch} already exists in the set")
else:
    print(f"{setSearch} is not in the set")

print("\n========== FINAL SCORE REPORT ==========\n")

# Activity 5

print("Original Array:")
print(scores)
print()

print("Final list:")
print(arrayToList)
print()

print("Tuple:")
print(listToTuple)
print()

print("Unique Scores:")
print(listToSet)
print()

print("Total Numbers of Scores:", len(scores))
print("Highest Score: ", highestScore)
print("Lowest Score: ", lowestScore)
print("Average Score: ", avg)
print()

print("Passing Score: ", passed)
print("Failing Score: ", failed)
print()

print("========== SCORE CLASSIFICATION ==========\n")


remarks = ""
for i in range(len(scores)):
    if scores[i] >= 90:
        remarks = "excellent"
    elif  scores[i] >= 80:
        remarks = "Very Good"
    elif  scores[i] >= 75:
        remarks = "Passed"
    else:
        remarks = "failed"

    print(f"{scores[i]} - {remarks}")