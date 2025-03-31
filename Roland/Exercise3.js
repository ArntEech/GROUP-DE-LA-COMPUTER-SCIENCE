const userName = prompt("Key in your name");

if (userName){
    const charCount = userName.length;
    console.log('The number of characters is ' +charCount);
}else{
    console.log("No name entered");
}

//Exercise 4
                //ARRAY METHOD
let a = 3;
let b = 4;

//swaping using destructuring
[a, b] = [b,a];

console.log(a);
console.log(b);

                //ARITHMETIC METHOD
let c = 3;
let d = 4;

c = c + d;
d = c - d;
c = c - d;