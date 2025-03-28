console.log("Welcome new user");
const city = prompt("What's the name of the city you grew up in?\n").trim();
const petName = prompt("What's your pet's name?\n").trim();

if (!city || !petName){
    alert("Please provide required information");
}
function nameGen(){
    return `${city} ${petName}`;
}
console.log(`Your band name is ${nameGen()}`);
