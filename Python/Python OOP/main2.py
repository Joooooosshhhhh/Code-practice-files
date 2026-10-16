class Student:

    studentNumber = 0
    def __init__(self, name, age, isStudent):
        self.name = name
        self.age = age
        Student.studentNumber += 1
        self.isStudent = isStudent