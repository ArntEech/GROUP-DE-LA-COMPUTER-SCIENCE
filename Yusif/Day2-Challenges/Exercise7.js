// Exercise 7 - Life in Weeks
// 📌 Instructions:

// Create a program that calculates the time left if you were to live until 90 years old.

// Example Input and Output:

// 🔹 Input: What is your current age? 56

// 🔹 Output: You have 12410 days, 1768 weeks, and 408 months left.

// 📝 Hint: Use math and f-strings equivalent in your programming language to format the message correctly.

const readline =require("readline")


const rl=readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question("Please enter your current age",(age)=>{
const Age=parseInt(age)
const yearsLeft=90-Age;
console.log(`you  have ${12*4*7*yearsLeft} days , ${12*4*yearsLeft} weeks and ${12*yearsLeft} months`)
rl.close()
})