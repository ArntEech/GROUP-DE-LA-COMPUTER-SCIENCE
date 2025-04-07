const prompt=require('prompt-sync')();
const userYear=prompt("Enter a year: ");
    if(userYear%4==0 && userYear%100==!0 && userYear%400==0){
        console.log(userYear +" is a leap year")

    }else if (userYear%4==0 && userYear%100==0 && userYear%400==0){
      console.log(userYear +" is a leap year")

    }
    else {console.log(userYear +" is not a leap year")}
