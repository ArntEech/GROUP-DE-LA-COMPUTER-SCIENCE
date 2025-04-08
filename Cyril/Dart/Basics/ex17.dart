import 'dart:io';

void main() {
  stdout.write("Enter the scores (separated by a space): ");
  List<String> inputScores = stdin.readLineSync()!.split(' ');

  List<int> scores = [];
  for (var score in inputScores) {
    scores.add(int.parse(score));
  }

  int highestScore = scores[0]; // Assuming first score is the highest initially

  for (var score in scores) {
    if (score > highestScore) {
      highestScore = score;
    }
  }

  print("The highest score in the class is: $highestScore");
}
