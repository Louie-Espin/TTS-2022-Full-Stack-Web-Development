/* 2022 Full Stack Web Development - Luis Espinoza */

/* For Loop - July 11
 *
 * Write a JavaScript for loop that will iterate from 0 to 99.
 * For each iteration, it will check if the current number is odd or even, and display a message to the screen.
 */

for (let i = 0; i < 100; i++) {
    if (i % 2 === 0) console.log(`${i} is even`)
    if (i % 2 === 1) console.log(`${i} is odd`)
}

/* If Statements #1 - July 11
 *
 * Write a script that stores the number of cups (that a person has consumed) in a variable
 * If the person has had *less than* 3 cups, log a message to the console saying: ("Yes I'll take another cup of coffee.")
 * If not, log a message to the console saying ("I think I'm okay for now.")
 */

let numOfCups = Math.floor(Math.random() * 4);

if (numOfCups < 3) console.log("Yes I'll take another cup of coffee");
else console.log("I think I'm okay for now.");
console.log(`cups: ${numOfCups}`);

/* If Statements #2 - July 11
 *
 * Write a script that stores the number of miles (that a car has) in a variable
 * If the car has *more than* 500 miles, log a message to the console saying: ("Yes I think I need an oil change.")
 * If not, log a message to the console saying ("My car doesn't need an oil change yet.")
 */

let numOfMiles = Math.floor(Math.random() * 1000);

if (numOfMiles > 500) console.log("Yes I think I need an oil change.");
else console.log("My car does not need an oil change yet.")
console.log(`mileage: ${numOfMiles}`);