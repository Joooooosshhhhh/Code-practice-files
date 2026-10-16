class Workout {
    constructor(exercise, duration, caloriesBurned) {
        this.exercise = exercise;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    getBurnRate() {
        
        let burnRate = (this.caloriesBurned / this.duration).toFixed(1);

        return burnRate;
    }

    isHighIntensity() {
        if(this.getBurnRate() >= 10) {
            return true;
        }
        else {
            return false;
        }
    }
}

const workoutData = [
  { type: "Running", durationMinutes: 30, caloriesBurned: 350 },
  { type: "Yoga", durationMinutes: 45, caloriesBurned: 180 },
  { type: "HIIT", durationMinutes: 20, caloriesBurned: 240 },
  { type: "Walking", durationMinutes: 60, caloriesBurned: 210 },
  { type: "Cycling", durationMinutes: 40, caloriesBurned: 420 }
];

const workouts = workoutData.map (
    data => new Workout(data.type, data.durationMinutes, data.caloriesBurned)
)

analyzeFitnessLog(workouts);

function analyzeFitnessLog(workouts) {

    console.log("================ WORKOUT LOG ================");

    let totalTime = 0;
    let totalCaloriesBurned = 0;
    let highIntensitySession = 0;

    for(let i = 0; i < workouts.length; i++) {
        
        let workout = workouts[i];
        totalCaloriesBurned += workout.caloriesBurned;
        totalTime += workout.duration;
        
        if (workout.isHighIntensity()) {
            console.log(`${workout.exercise} - ${workout.duration} minutes | ${workout.caloriesBurned} cals (${workout.getBurnRate()} cal/min) [HIGH INTENSITY]`);
            highIntensitySession++;
        }
        else{
            console.log(`${workout.exercise} - ${workout.duration} minutes | ${workout.caloriesBurned} cals (${workout.getBurnRate()} cal/min)`);
        }
    }

    console.log(`Total Time: ${totalTime} mins`);
    console.log(`Total Calories Burned: ${totalCaloriesBurned} cal`);
    console.log(`High-Intensity Sessions: ${highIntensitySession}`);
}
