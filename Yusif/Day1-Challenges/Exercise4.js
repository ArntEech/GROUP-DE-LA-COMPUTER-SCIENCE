const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter value for a: ", (a) => {
    rl.question("Enter value for b: ", (b) => {
        console.log("Before Swap: a =", a, ", b =", b);

        // Swap values
        [a, b] = [b, a];

        console.log("After Swap: a =", a, ", b =", b);
        rl.close();
    });
});
