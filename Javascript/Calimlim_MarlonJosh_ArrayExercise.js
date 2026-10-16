'use strict';

console.log('STUDENT SCORE ARRAY ANALYZER');

// Store the original names and final scores.
const studentNames = [
    'Ana',
    'Ben',
    'Carla',
    'Daniel',
    'Ella'
];
const studentScores = [85, 72, 91, 64, 78];

// Store three activity scores for each original student.
const activityScores = [
  [80, 85, 90],
  [70, 72, 74],
  [88, 92, 95],
  [60, 65, 67],
  [75, 78, 81]
];

// Preserve the original names for the activity matrix.
const originalNames = Array.from(studentNames);

console.log('\nPART A: ORIGINAL RECORDS');

// TODO: Use a for loop to display every name and score.
for (let index = 0; index < studentNames.length; index++) {
    console.log(`${index} - ${studentNames[index]}: ${studentScores[index]}`);
}



console.log('\nPART B: ADD NEW STUDENTS');

// TODO: Add Faith and 88 at the end.
// TODO: Add Aaron and 76 at the beginning.
// TODO: Display both arrays and their length.

studentNames.push("Faith");
studentScores.push(88);

studentNames.unshift("Aaron");
studentScores.unshift(76);

console.log("Updated Names: ", studentNames);
console.log("Updated Score: ", studentScores);
console.log("Number of Students: ", studentNames.length);



console.log('\nPART C: REMOVE AND REPLACE RECORDS');

// TODO: Remove the first name and score.
// TODO: Remove the last name and score.
// TODO: Find Daniel's index.
// TODO: Remove Daniel and Daniel's score.
// TODO: Insert Grace and 82 at index 2.
// TODO: Display the updated arrays.

studentNames.shift();
studentScores.shift();

studentNames.pop();
studentScores.pop();

let indexDaniel = studentNames.indexOf("Daniel")
studentNames.splice(indexDaniel, 1);
studentScores.splice(indexDaniel, 1);

studentNames.splice(2, 0, "Grace");
studentScores.splice(2, 0, 82);

console.log("Names: ", studentNames);
console.log("Scores: ", studentScores);



console.log('\nPART D: CLASS STATISTICS');

// TODO: Calculate the total score.
// TODO: Calculate the average score.
// TODO: Find the highest score.
// TODO: Find the lowest score.
// TODO: Display all statistics.

let totalScore = 0;
let highestScore = studentScores[0];
let lowestScore = studentScores[0];

for(let index = 0; index < studentScores.length; index++) {
    totalScore += studentScores[index];

    if(studentScores[index] > highestScore) {
        highestScore = studentScores[index];
    }

    if(studentScores[index] < lowestScore) {
        lowestScore = studentScores[index];
    }
}

let average = (totalScore / studentScores.length).toFixed(2);

console.log("Total Score: ", totalScore);
console.log("Average Score: ", average);
console.log("Highest Score: ", highestScore);
console.log("Lowest Score: ", lowestScore);



console.log('\nPART E: PASSING-SCORE ANALYSIS');

// TODO: Use filter to obtain passing scores.
// TODO: Use map to produce Passed or Failed statuses.
// TODO: Use some to check whether at least one student failed.
// TODO: Use every to check whether all students passed.
// TODO: Display all results.

const passingScore = grade => grade >= 75

const passedScore = studentScores.filter(passingScore);
const studentStatus = studentScores.map(grade => grade >= 75 ? "Passed" : "Failed");
const atLeastOneFailed = studentScores.some(grade => grade < 75);
const allStudentPassed = studentScores.every(passingScore);

console.log("Passing Scores: ", passedScore);
console.log("Statuses: ", studentStatus);
console.log("At Least One Failed: ", atLeastOneFailed);
console.log("All Students Passed: ", allStudentPassed);



console.log('\nPART F: SORT AND SEARCH');

// TODO: Copy the scores using Array.from.
// TODO: Sort the copy from highest to lowest.
// TODO: Search for 91 using includes and indexOf.
// TODO: Display the results.

const copy = Array.from(studentScores);
const sortedCopy = copy.sort((a,b) => b - a);
const includes91 = sortedCopy.includes(91);
const indexOf91 = sortedCopy.indexOf(91);

console.log("Scores from Highest to Lowest: ", sortedCopy);
console.log(" Contains 91: ", includes91);
console.log("Index of 91: ", indexOf91);



console.log('\nPART G: TWO-DIMENSIONAL ARRAY');

const activityAverages = [];

// TODO: Use nested loops to process every row and column.
// TODO: Calculate and store each student's activity average.
// TODO: Display activityAverages.
;
for(let i = 0; i < activityScores.length; i++) {
    let sumScore = 0;

    for(let j = 0; j < activityScores[i].length; j++) {
        sumScore += activityScores[i][j];
    }

    activityAverages.push((sumScore / activityScores[i].length).toFixed(2));

    console.log(`${originalNames[i]}'s activity average: ${activityAverages[i]}`)
}

console.log("Activity Averages:", activityAverages);



console.log('\nPART H: TEXT SUMMARY');

// TODO: Use join to display names separated by " | ".
const textSummary = studentNames.join(" | ");
console.log("Students:", textSummary);
