import 'dart:io';

void main() {
  print("""Welcome to the Rock, Paper, Scissors game!
You will be playing against the one and only, the undefeated champion: THE COMPUTER !!!!
Good luck and remember to have fun!
""");

  print(
    "Rock, Paper, Scissors; Which of these will you choose? (0 for Rock, 1 for Scissors, 2 for Paper): ",
  );
  int userInput = int.parse(stdin.readLineSync()!);
}
