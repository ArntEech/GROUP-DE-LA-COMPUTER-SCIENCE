//Exercise 16
const student_heights = prompt("Input a list of student heights \n").split(" ").map(Number);

let totalHeight = 0;
let number = 0;

for (let n = 0 ; n < student_heights.length ; n++){
    totalHeight += student_heights[n]; 
    number+= 1;
}
console.log(`Average height in array is ${totalHeight/number}`);

//Exercise 17
const array = prompt("Input the list of numbers \n").split(" ").map(Number);
let maxNumber = 0;
for (let n = 0; n < array.length ; n++){
    if (array[n] > maxNumber){
        maxNumber = array[n];
    }
    else {
        maxNumber = maxNumber;
    }
}
console.log(maxNumber);
