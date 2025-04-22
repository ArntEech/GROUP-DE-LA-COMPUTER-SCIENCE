const prompt=require('prompt-sync')();

function loveCalculator(){
  const name1= prompt('Enter your name: ');
  const name2= prompt('Enter your crush name: ');

  const commbinedName=(name1+name2).toLowerCase();
let trueLetters=['t','r','u','e'];
let loveLetters=['l','o','v','e'];

let truescore=0;
let lovescore=0;

trueLetters.forEach((Letter=>{
  if(commbinedName.includes(Letter)){
    truescore ++;

  }
}))
loveLetters.forEach((Letter=>{
  if(commbinedName.includes(Letter)){
    lovescore ++;

  }
}))
let totalScore=Math.ceil((truescore+lovescore)/commbinedName.length*100);

if(totalScore<10 || totalScore>90){
  console.log(`Your love score is ${totalScore}%, you go together like coke and mentos`);
}else if(totalScore>=40 && totalScore<=50){
  console.log(`Your love score is ${totalScore}%, you are alright together`);
}else if(totalScore>50 && totalScore<=70){
  console.log(`Your love score is ${totalScore}%, you are good together`);
}else{
  console.log(`Your love score is ${totalScore}%`);
}


}
loveCalculator()
