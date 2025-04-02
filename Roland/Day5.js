const student_heights = prompt("Input a list of student heights \n").split(" ").map(Number);

let totalHeight = 0;
let number = 0;

for (let n = 0 ; n < student_heights.length ; n++){
    totalHeight += student_heights[n]; 
    number+= 1;
}
console.log(`Average height in array is ${totalHeight/number}`);
