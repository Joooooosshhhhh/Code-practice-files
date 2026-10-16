const studentGrade = [85, 72, 91, 64, 78, 150, -10]

let passed = 0
let failed = 0
let totalScore = 0
let highestScore = 0
let lowestScore = 100
let numberOfValidStudents = 0

// display all student score.
console.log("Student Score:")
for (let i = 0; i < studentGrade.length; i++) {
    console.log(studentGrade[i])
}
console.log()

// Determine whether each student passed or faied.
for (let j = 0; j < studentGrade.length; j++) {
    
    let remark =""
    let status =""

    if (studentGrade[j] <= 100 && studentGrade[j] >= 0) {
        numberOfValidStudents++
        totalScore += studentGrade[j]
         

        if (studentGrade[j] <=100 && studentGrade[j] >= 90) {
            remark ="Excellent"
            status ="passed"
            passed++
        } 
        
        else if (studentGrade[j] < 90 && studentGrade[j] >= 80) {
            remark ="Very Good"
            status ="passed"
            passed++
        }
        else if (studentGrade[j] < 80 && studentGrade[j] >= 75) {
            remark ="Good"
            status ="passed"
            passed++
        }
        else if (studentGrade[j] < 75 && studentGrade[j] >= 0) {
            remark ="failed"
            status =""
            failed++
        }
        else {
            remark ="Invalid Number"
            status =""
        }

        if(studentGrade[j] > highestScore) {
            highestScore = studentGrade[j]
        }

        if(studentGrade[j] < lowestScore) {
            lowestScore = studentGrade[j]
        }   
    } 
    
    else {
        remark ="Invalid Number"
    }
    
    if(status == "passed") {
        console.log(`student ${j + 1}: ${studentGrade[j]} - ${remark} - ${status}`)
    }
    else {
        console.log(`student ${j + 1}: ${studentGrade[j]} - ${remark}`)
    }

}

console.log()

// calculate the total score.
console.log(`Total Score: ${totalScore}`)

// calculate calculate the average score
let averageScore = totalScore / numberOfValidStudents
console.log(`Average Score: ${averageScore}`)

// display the highest score
console.log(`Highest Score: ${highestScore}`)

// display the lowest Scroll
console.log(`Lowest Score: ${lowestScore}`)

// display the number of students who passed
console.log(`Passed: ${passed}`)

// display the number of students who failed
console.log(`Failed: ${failed}`)