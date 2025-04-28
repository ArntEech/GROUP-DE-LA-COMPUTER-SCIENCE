//Exercise 9 - BMI Calculator 2.0 
let weight = prompt("Enter your weight");
let height = prompt("Enter your height");

weight = Number(weight);
height = Number(height);

let bmi = weight / (height * height);

let roundedbmi = Math.round(bmi);

let interpretation = "";

if (bmi < 18.5) {
  interpretation = "underweight";
} else if (bmi >= 18.5 && bmi <= 24.9) {
  interpretation = "normal weight";
} else if (bmi >= 25 && bmi <= 29.9) {
  interpretation = "overweight";
} else if (bmi >= 30 && bmi <= 34.9) {
  interpretation = "obese";
} else if (bmi >= 35) {
  interpretation = "clinically obese";
}
console.log(`Your BMI is ${roundedbmi}, you are ${interpretation}`);
  


//Exercise 10
let year = parseInt(prompt("Enter a year:"));

if (year % 4 ===0) {
  if (year % 100 === 0) {
    if (year % 400 === 0) {
      console.log("Leap year.");
    } else {
      console.log("Not a leap year.");
    }
   } else {
    console.log("Leap year.");
    }
  } else {
    console.log("Not a leap year.");
  }

  ORRRRRRRRRRRRR

  let year = parseInt(prompt("Enter a year:"));  if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
    console.log("Leap year.");
  } else {
    console.log("Not a leap year.");
  }


  //Exercise 11
  function pizzaOrder() {
    alert("🍕 Welcome to Papa's Pizza ");
  
    let size = prompt("What size pizza do you want? Small, Medium, or Large:");
    let pepperoni = prompt("Do you want pepperoni? Yes or No:");
    let extraCheese = prompt("Do you want extra cheese? Yes or No:");
  
    size = size.toLowerCase();
    pepperoni = pepperoni.toLowerCase();
    extraCheese = extraCheese.toLowerCase();
  
    let bill = 0;
  
    // Set base price based on size
    if (size === "small") {
      bill += 45; // e.g., GHS 45 for small
      if (pepperoni === "yes") bill += 8; // GHS 8 for small pepperoni
    } else if (size === "medium") {
      bill += 70;
      if (pepperoni === "yes") bill += 10;
    } else if (size === "large") {
      bill += 95;
      if (pepperoni === "yes") bill += 10;
    } else {
      alert("Invalid size selected. Please try again.");
      return;
    }
  
    // Extra cheese for any size
    if (extraCheese === "yes") {
      bill += 5; // GHS 5 for cheese
    }
  
    alert(`🧾 Your final bill is: GHS ${bill}\nThank you for ordering with Papa's Pizza! 🍕`);
  }
  
  pizzaOrder();

  // Exercise 12
  // Function to calculate the love score
function calculateLove() {
  // Prompt for names
  const name1 = prompt("What is your name?").toLowerCase();
  const name2 = prompt("What is their name?").toLowerCase();

  // Combine both names
  const combinedNames = name1 + name2;

  // Count the occurrences of the letters in "TRUE"
  const trueCount = countLetters(combinedNames, "true");

  // Count the occurrences of the letters in "LOVE"
  const loveCount = countLetters(combinedNames, "love");

  // Combine TRUE and LOVE counts to form a score
  const score = Number(`${trueCount}${loveCount}`);

  // Create the message based on the score
  let message = `Your score is ${score}.`;

  if (score < 10 || score > 90) {
    message += " You go together like coke and mentos! 💥";
  } else if (score >= 40 && score <= 50) {
    message += " You are alright together. 💫";
  }

  // Output the message in the console
  console.log(message);
}

// Helper function to count occurrences of letters
function countLetters(text, letters) {
  let count = 0;
  for (let char of letters) {
    count += (text.split(char).length - 1);
  }
  return count;
}

// Run the function
calculateLove();

  

   


