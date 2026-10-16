# import random
# import time
# import threading
#
# quiz_question = [
#     {
#         "Question": "What is the basic unit of life?",
#         "Choice": "A. Atom B. Cell C. Organ D. Tissue",
#         "Answer": "B. Cell"
#     },
#
#     {
#         "Question": "Which organ pumps blood throughout the human body?",
#         "Choice": "A. Brain B. Lung C. Heart D. Liver",
#         "Answer": "C. Heart"
#     },
#
#     {
#         "Question": "Which natural resource is used to generate hydroelectric power?",
#         "Choice": "A. Coal B. Water C. Wind D. Oil",
#         "Answer": "B. Water"
#     }
# ]
#
#
#
# def start_quiz():
#     random.shuffle(quiz_question)
#     score = 0
#     seconds = 10
#
#
#     def countdown():
#         for c in range(10, 0, -1):
#             print(f"Time left: {c} seconds", end="\r")
#             time.sleep(1)
#     time_thread = threading.Thread(target=countdown)
#
#     for i in quiz_question:
#         print(i["Question"])
#         print(i["Choice"])
#         answers = input("Answer: ").lower()
#         countdown()
#
#         print("===============================")
#         if answers == i["Answer"][0].lower():
#             print("You are correct!")
#             print("===============================")
#             score += 1
#         else:
#             print("You are Incorrect! Answer: ", i["Answer"])
#             print("===============================")
#
#
#     print(f"Your score is: {score}/{len(quiz_question)}")
#
# while True:
#     start_quiz()
#     again = input("Try again? Yes/No: ").lower()
#     if again != "yes":
#         print("goodbye!")
#         break
#

# number = [5,6]
# num1 = input()
#
# if num1 == number:
#     print("same")
# elif num1 != number:
#     print("not same")

inputNum = int(input("Set stopping point: "))

EvenCount = 0
CurrentNumber = 1

while inputNum <= CurrentNumber:
    