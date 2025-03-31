const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter your name: ", (Name) => {
    console.log("Total characters (including spaces):", Name.length);

    let withoutSpaces = Name.replace(/\s/g, ""); // Removes all spaces
    console.log("Characters without spaces:", withoutSpaces.length);

    rl.close();
});
