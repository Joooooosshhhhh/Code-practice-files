
class Student {
    constructor(name, scores) {
        this.name = name;
        this.scores = scores;
        this.letterGrade = "";
    }


    getAverage() {
        let sum = 0;
        for (let i = 0; i < this.scores.length; i++) {
            sum += this.scores[i];
        }

        return sum / this.scores.length;
    }

    getLetterGrade() {
        let average = this.getAverage();
        if(average >= 90) {
            this.letterGrade = 'A'
        }
        else if(average >= 80) {
            this.letterGrade = 'B'
        }
        else if(average >= 70) {
            this.letterGrade = 'C'
        }
        else if(average >= 60) {
            this.letterGrade = 'D'
        }
        else {
            this.letterGrade = 'F'
        }

        return this.letterGrade;
    }

     
}

const studentData = [
  { name: "Lany", scores: [85, 90, 92] },
  { name: "Bongbung", scores: [70, 75, 68] },
  { name: "Dutherthe", scores: [95, 98, 92] },
  { name: "Pico", scores: [55, 60, 58] }
];

const studentInstances = studentData.map(
    data => new Student(data.name, data.scores)
);

analyzeClass(studentInstances)

function analyzeClass(students) {
    let classSum = 0;
    let topStudentGrade = 0;
    let topStudentName = "";

    console.log("------- STUDENT REPORT -------");
    for(let j = 0; j < students.length; j++) {
        
        const student = students[j];
        const avg = student.getAverage();

        console.log(`${student.name} - Average: ${avg.toFixed(1)} | Grade: ${student.getLetterGrade()}`);
        classSum += avg;

        if (avg > topStudentGrade) {
            topStudentGrade = avg;
            topStudentName = student.name;
        }
    }

    let classAverage = classSum / students.length;

    console.log("------------------------------");
    console.log(`Class Average: ${classAverage.toFixed(1)}`);
    console.log(`Top Student: ${topStudentName} with ${topStudentGrade.toFixed(1)}`);
}

