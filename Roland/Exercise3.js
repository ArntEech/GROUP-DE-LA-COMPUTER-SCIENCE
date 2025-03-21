const userName = prompt("Key in your name");

if (username){
    const charCount = userName.length;
    console.log('The number of characters is ${charCount}');
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
let a = 3;
let b = 4;

a = a + b;
b = a - b;
a = a - b;