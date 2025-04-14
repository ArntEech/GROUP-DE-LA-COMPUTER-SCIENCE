//Exercise 25
const height = parseInt(prompt("What is the height of the wall? \n"));
const width = parseInt(prompt("What is the width of the wall? \n"));

function calculate(){
    return Math.ceil((height * width)/5);
}
console.log(`You will need ${calculate()} cans of paint to complete the job`);

//Exercise 26
const n = prompt("Check this number: ");

function isPrime(number){
    if (number === 2){
        return true;
    }else if (number % 2 === 0){
        return false;
    } 
    const limit = Math.sqrt(number);
    for (let i = 3; i <= limit; i += 2) { 
        if (number % i === 0) {
            return false
        };
    }
    return true;
}

function primeChecker(number = n){
    if (number <= 1 ){
        console.log("Negative numbers can't be prime");
    } else if (isPrime(number) === true ){
        console.log("This number is prime");
    } else {
        console.log("This number is not prime");
    }
}
primeChecker();