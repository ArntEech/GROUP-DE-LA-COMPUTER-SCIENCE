// Write a program that adds the digits in a two-digit number.

// Example:

// 🔹 Input: 35

// 🔹 Output: 3 + 5 = 8

// 📝 Hint: Research how to convert data types in your programming language.
const readline =require("readline")

const rl=readline.createInterface({
    input:process.stdin,
    output:process.stdout
});
rl.question("Enter a two-didgit number: ",(num)=>{
if(num.length !==2 || isNaN(num)){
    console.log("please enter a valid two-digit number.");
}
else{
    const firstDigit=parseInt(num[0])
    const secondDigit=parseInt(num[1])
    const sum= firstDigit+secondDigit
    console.log(`${firstDigit} +${secondDigit}=${sum}`)
}
rl.close()
})