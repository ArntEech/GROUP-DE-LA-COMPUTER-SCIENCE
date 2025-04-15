// for browser
function playRPS() {
    const asciiArt = 

    rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = 
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)


    const choices = ["Rock", "Scissors", "Paper"];
    const userInput = prompt("Rock, Paper, Scissors!\nType 0 for Rock, 1 for Scissors, 2 for Paper:");
    const playerChoice = parseInt(userInput);
  
    if (isNaN(playerChoice) || playerChoice < 0 || playerChoice > 2) {
      console.log("Invalid input! Please refresh and try again.");
      return;
    }
  
    const computerChoice = Math.floor(Math.random() * 3);
  
    console.clear();
    console.log("You chose:\n" + asciiArt[playerChoice]);
    console.log("THE COMPUTER chose:\n" + asciiArt[computerChoice]);
  
    if (playerChoice === computerChoice) {
      console.log("It's a tie!");
    } else if (
      (playerChoice === 0 && computerChoice === 1) ||
      (playerChoice === 1 && computerChoice === 2) ||
      (playerChoice === 2 && computerChoice === 0)
    ) {
      console.log("You WIN! 🎉");
    } else {
      console.log("THE COMPUTER Wins! 😎");
    }
  
    const again = confirm("Play again?");
    if (again) playRPS();
  }
  
  playRPS();
  