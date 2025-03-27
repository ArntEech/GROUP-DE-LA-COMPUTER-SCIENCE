const { parse } = require("path");
const readline =require("readline")

const rl=readline.createInterface({
    input:process.stdin,
    output:process.stdout
});
rl.question("Enter your height in m: ",(height)=>{
    rl.question("Enter your weight in kg: ",(weight)=>{
        const w=parseInt(weight)
        const h=parseInt(height)
        const BMI=Math.round(w/(h*h));
        console.log(`your Body Mass Index is: ${BMI}`)
        rl.close()

    })

}
)