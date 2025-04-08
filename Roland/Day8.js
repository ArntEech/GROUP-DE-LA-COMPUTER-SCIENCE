//Exercise 27
const scoresData = {
    Harry: 81,
    Ron: 78,
    Hermione: 99,
    Draco: 74,
    Neville: 62
};

const ratingsData = {};

for (const name in scoresData){
    const score = scoresData[name];
    let rating;

    if (score > 90){
        rating = "Outstanding";
    } else if (80 <score<= 90){
        rating = "Exceeds Expectations";
    } else if (70 <score<= 80){
        rating = "Acceptable";
    } else if ( score < 70){
        rating = "Fail";
    }

    ratingsData[name] = rating;
}

console.log(ratingsData);

//Exercise 28