//Create a program that calculates the time left if you were to live until 90 years old.

//let age = +prompt('What is your age?', '');

var age = 56;

function timeLeft(age) {
    const yearsLeft = 90 - age;
    const daysLeft = yearsLeft * 365.25;
    const weeksLeft = yearsLeft * 52;
    const monthsLeft = yearsLeft * 12;

    console.log(`You have ${daysLeft} days, ${weeksLeft} weeks and ${monthsLeft} months left`);
}

timeLeft(age);